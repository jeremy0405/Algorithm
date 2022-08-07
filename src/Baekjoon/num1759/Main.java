package Baekjoon.num1759;

/*
	문제    : BOJ 암호 만들기
    유형    : 백트래킹
	난이도   : EASY (G5)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/1759
    날짜    : 22.08.06(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int l;
	static int c;
	static char[] input;
	static char[] output;
	static String[] aeiou = new String[]{"a", "e", "i", "o", "u"};
	static List<String> answer = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		l = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		input = new char[c];
		for (int i = 0; i < c; i++) {
			input[i] = st.nextToken().charAt(0);
		}
		Arrays.sort(input);

		output = new char[l];

		dfs(0, 0);

		StringBuilder sb = new StringBuilder();
		for (String result : answer) {
			int count = countAEIOU(result);
			if (count >= 1 && l - count >= 2) {
				sb.append(result).append('\n');
			}
		}

		System.out.println(sb);
	}

	private static int countAEIOU(String result) {
		int count = 0;
		for (String s : aeiou) {
			if (result.contains(s)) {
				count++;
			}
		}
		return count;
	}

	private static void dfs(int depth, int start) {
		if (depth == l) {
			answer.add(String.valueOf(output));
			return;
		}

		for (int i = start; i < c; i++) {
			output[depth] = input[i];
			dfs(depth + 1, i + 1);
		}
	}

}
