package Baekjoon.num15649;

/*
	문제    : BOJ N과 M (1)
    유형    : 백트래킹
	난이도   : EASY(S3)
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/15649
    날짜    : 22.07.11(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	static boolean[] visited;
	static int n;
	static int m;
	static int[] answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[n];
		answer = new int[m];

		dfs(0);
	}

	private static void dfs(int depth) {
		if (depth == m) {
			for (int i : answer) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				answer[depth] = i + 1;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}

}
