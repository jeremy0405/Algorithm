package Baekjoon.num15654;

/*
	문제    : BOJ N과 M (5)
    유형    : 백트래킹
	난이도   : MEDIUM(S3)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/15654
    날짜    : 22.04.07(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int M;
	static int[] arr;
	static int[] answer;
	static boolean[] visitied;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		visitied = new boolean[N];
		answer = new int[M];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		dfs(0);
		System.out.println(sb);

	}

	private static void dfs(int depth) {

		if (depth == M) {
			for (int i : answer) {
				sb.append(i).append(' ');
			}
			sb.append(System.lineSeparator());
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visitied[i]) {
				visitied[i] = true;
				answer[depth] = arr[i];
				dfs(depth + 1);
				visitied[i] = false;
			}

		}

	}

}
