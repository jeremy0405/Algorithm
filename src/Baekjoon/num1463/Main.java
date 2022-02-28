package Baekjoon.num1463;

/*
	문제    : BOJ 최소 힙
    유형    : 자료구조, 우선순위 큐
	난이도   : EASY(S2)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/1927
    날짜    : 22.02.27(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int[] dp = new int[x + 1];
		dp[0] = 0;
		dp[1] = 0;

		for (int i = 2; i <= x; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
			}
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
			}
		}
		System.out.println(dp[x]);
	}

}
