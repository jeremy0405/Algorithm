package Baekjoon.num15657;

/*
	문제    : BOJ N과 M (8)
    유형    : 백트래킹
	난이도   : MEDIUM(S3)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/15657
    날짜    : 22.06.21(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static boolean[] visited;
	static int[] arr;
	static int[] answer;
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		answer = new int[M];
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		dfs(0, 0);

		System.out.println(sb);
	}

	private static void dfs(int index, int depth) {
		if (M == depth) {
			for (int i : answer) {
				sb.append(i).append(" ");
			}
			sb.append('\n');
			return;
		}

		for (int i = index; i < N; i++) {
			answer[depth] = arr[i];
			dfs(i, depth + 1);
		}

	}

}
