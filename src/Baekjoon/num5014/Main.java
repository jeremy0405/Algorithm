package Baekjoon.num5014;

/*
	문제    : BOJ 스타트링크
    유형    : bfs
	난이도   : EASY (G5)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/5014
    날짜    : 22.07.18(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int f = Integer.parseInt(input[0]);
		int s = Integer.parseInt(input[1]);
		int g = Integer.parseInt(input[2]);
		int u = Integer.parseInt(input[3]);
		int d = Integer.parseInt(input[4]);

		int[] answer = new int[f + 1];
		boolean[] visited = new boolean[f + 1];

		Queue<Integer> q = new LinkedList<>();
		q.offer(s);
		visited[s] = true;
		answer[s] = 0;

		while (!q.isEmpty()) {
			int stair = q.poll();
			if (stair == g) {
				System.out.println(answer[stair]);
				System.exit(0);
			}

			if (stair + u <= f && !visited[stair + u]) {
				q.offer(stair + u);
				visited[stair + u] = true;
				answer[stair + u] = answer[stair] + 1;
			}
			if (stair - d >= 1 && !visited[stair - d]) {
				q.offer(stair - d);
				visited[stair - d] = true;
				answer[stair - d] = answer[stair] + 1;
			}
		}

		System.out.println("use the stairs");

	}

}
