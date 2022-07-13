package Baekjoon.num15651;

/*
	문제    : BOJ N과 M (3)
    유형    : 백트래킹
	난이도   : EASY(S3)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/15651
    날짜    : 22.07.13(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int m;
	static int[] answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		answer = new int[m];

		StringBuilder sb = new StringBuilder();
		dfs(0, sb);
		System.out.println(sb);

	}

	private static void dfs(int depth, StringBuilder sb) {
		if (depth == m) {
			for (int i : answer) {
				sb.append(i).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < n; i++) {
			answer[depth] = i + 1;
			dfs(depth + 1, sb);
		}

	}

}
