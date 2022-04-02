package Baekjoon.num6603;

/*
	문제    : BOJ 로또
    유형    : 백트래킹
	난이도   : MEDIUM(S2)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/6603
    날짜    : 22.04.03(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	static boolean[] visited;
	static int[] answer = new int[6];
	static int k;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());

			if (k == 0) {
				break;
			}

			arr = new int[k];
			visited = new boolean[k];

			for (int i = 0; i < k; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			dfs(0, 0);
			System.out.println(sb);
			sb.setLength(0);
		}
	}

	private static void dfs(int start, int depth) {

		if (depth == 6) {
			for (int i = 0; i < 6; i++) {
				sb.append(answer[i]).append(' ');
			}
			sb.append(System.lineSeparator());
			return;
		}

		for (int i = start; i < k; i++) {

			answer[depth] = arr[i];
			dfs(i + 1, depth + 1);

		}

	}

}
