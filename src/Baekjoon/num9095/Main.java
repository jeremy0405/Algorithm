package Baekjoon.num9095;

/*
	문제    : BOJ 1, 2, 3 더하기
    유형    : DP
	난이도   : EASY (S3)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/9095
    날짜    : 22.02.20(o)
    refer  :
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		int[] target = new int[testCase];

		int max = 0;
		for (int i = 0; i < testCase; i++) {
			target[i] = sc.nextInt();
			max = Math.max(max, target[i]);
		}

		int[] dp = new int[max + 1];

		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;

		for (int i = 4; i < max + 1; i++) {
			dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
		}

		for (int targetNum : target) {
			System.out.println(dp[targetNum]);
		}

	}
}
