package Baekjoon.num9461;

/*
	문제    : BOJ 파도반 수열
    유형    : dp
	난이도   : EASY(S3)
	시간    : 15m
	uri    : https://www.acmicpc.net/problem/9461
    날짜    : 22.03.02(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int[] arr = new int[testCase];

		int max = 0;
		for (int i = 0; i < testCase; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}

		// 1 2 3 4 5 6 7 8 9 10
		// 1 1 1 2 2 3 4 5 7 9
		long[] dp;

		if (max <= 5) {
			dp = new long[6];
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 1;
			dp[4] = 2;
			dp[5] = 2;

		} else {
			dp = new long[max + 1];
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 1;
			dp[4] = 2;
			dp[5] = 2;

			for (int i = 6; i <= max; i++) {
				dp[i] = dp[i - 1] + dp[i - 5];
			}
		}

		for (int i = 0; i < testCase; i++) {
			System.out.println(dp[arr[i]]);
		}

	}
}
