package Baekjoon.num2644;

/*
	문제    : BOJ 촌수계산
    유형    : bfs
	난이도   : MEDIUM(S2)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/2644
    날짜    : 22.04.08(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int[][] connect;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int p1 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());

		int m = Integer.parseInt(br.readLine());

		connect = new int[n + 1][n + 1];
		visited = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			connect[start][end] = 1;
			connect[end][start] = 1;
		}

		System.out.println(bfs(p1, p2));

	}

	private static int bfs(int p1, int p2) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(p1);
		visited[p1] = true;
		int count = 0;

		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int number = q.poll();
				if (number == p2) {
					return count;
				}

				for (int j = 1; j <= n; j++) {
					if (!visited[j] && connect[number][j] == 1) {
						q.offer(j);
						visited[j] = true;
					}
				}
			}
			count++;
		}
		return -1;
	}

}
