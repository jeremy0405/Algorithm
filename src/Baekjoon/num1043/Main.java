package Baekjoon.num1043;

/*
	문제    : BOJ 거짓말
    유형    : bfs
	난이도   : MEDIUM(G4)
	시간    : 60m
	uri    : https://www.acmicpc.net/problem/1043
    날짜    : 22.04.20(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<int[]> info;
	static boolean[] known;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		info = new ArrayList<>();
		known = new boolean[n + 1];

		st = new StringTokenizer(br.readLine());
		int recognizedPerson = Integer.parseInt(st.nextToken());

		for (int i = 0; i < recognizedPerson; i++) {
			known[Integer.parseInt(st.nextToken())] = true;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int participants = Integer.parseInt(st.nextToken());
			int[] participantInfo = new int[participants];
			for (int j = 0; j < participants; j++) {
				participantInfo[j] = Integer.parseInt(st.nextToken());
			}
			info.add(participantInfo);
		}

		bfs();

		int count = 0;

		for (int[] participants : info) {
			boolean canLie = true;
			for (int participant : participants) {
				if (known[participant]) {
					canLie = false;
					break;
				}
			}
			if (canLie) {
				count++;
			}
		}

		System.out.println(count);

	}

	private static void bfs() {
		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i < known.length; i++) {
			if (known[i]) {
				q.add(i);
			}
		}

		while (!q.isEmpty()) {
			int person = q.poll();

			for (int i = 0; i < info.size(); i++) {
				int[] participants = info.get(i);
				boolean canLie = true;

				for (int participant : participants) {
					if (participant == person) {
						canLie = false;
						break;
					}
				}

				if (!canLie) {
					for (int participant : participants) {
						if (!known[participant]) {
							known[participant] = true;
							q.add(participant);
						}
					}
				}

			}

		}

	}

}
