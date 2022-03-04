package Baekjoon.num2579;

/*
	문제    : BOJ 계단 오르기
    유형    : dp
	난이도   : EASY(S3)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/2579
    날짜    : 22.03.04(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];
		int[] dp = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		if (N == 1) {
			System.out.println(arr[1]);
		} else if (N == 2) {
			System.out.println(arr[1] + arr[2]);
		} else {
			dp[1] = arr[1];
			dp[2] = dp[1] + arr[2];

			for (int i = 3; i <= N; i++) {
				dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
			}
			System.out.println(dp[N]);
		}

	}

}
