package Baekjoon.num1149;

/*
	문제    : BOJ RGB 거리
    유형    : DP
	난이도   : EASY (S2)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/1149
    날짜    : 22.02.23(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] red = new int[N];
		int[] green = new int[N];
		int[] blue = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			red[i] = Integer.parseInt(st.nextToken());
			green[i] = Integer.parseInt(st.nextToken());
			blue[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i < N; i++) {
			red[i] = Math.min(green[i - 1] + red[i], blue[i - 1] + red[i]);
			green[i] = Math.min(red[i - 1] + green[i], blue[i - 1] + green[i]);
			blue[i] = Math.min(green[i - 1] + blue[i], red[i - 1] + blue[i]);
		}

		System.out.println(Math.min(Math.min(red[N - 1], green[N - 1]), blue[N - 1]));

	}
}
