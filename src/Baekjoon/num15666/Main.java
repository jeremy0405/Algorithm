package Baekjoon.num15666;

/*
	문제    : BOJ N과 M (12)
    유형    : 백트래킹
	난이도   : MEDIUM(S2)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/15666
    날짜    : 22.07.11(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int m;
	static int[] arr;
	static String[] answer;
	static Set<String> answers = new LinkedHashSet<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n];
		answer = new String[m];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		dfs(0, 0);

		StringBuilder sb = new StringBuilder();
		for (String answer : answers) {
			sb.append(answer).append('\n');
		}

		System.out.println(sb);

	}

	private static void dfs(int depth, int index) {
		if (depth == m) {
			StringBuilder sb = new StringBuilder();
			for (String s : answer) {
				sb.append(s).append(' ');
			}
			answers.add(sb.toString());
			return;
		}

		for (int i = index; i < n; i++) {
			answer[depth] = arr[i] + "";
			dfs(depth + 1, i);
		}
	}


}
