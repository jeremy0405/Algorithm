package Baekjoon.num15652;

/*
	문제    : BOJ N과 M (4)
    유형    : 백트래킹
	난이도   : MEDIUM(S3)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/15652
    날짜    : 22.04.06(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int N;
	static int M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		N = Integer.parseInt(s[0]);
		M = Integer.parseInt(s[1]);

		arr = new int[N];

		dfs(1, 0);

		System.out.println(sb);

	}

	private static void dfs(int start, int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = start; i <= N; i++) {

			arr[depth] = i;
			dfs(i, depth + 1);

		}
	}

}
