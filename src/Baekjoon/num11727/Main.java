package Baekjoon.num11727;

/*
	문제    : BOJ 2xn 타일링 2
    유형    : dp
	난이도   : EASY(S3)
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/11727
    날짜    : 22.05.24(o)
    refer  :
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] dp = new int[n + 1];

		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i < n + 1; i++) {
			dp[i] = (2 * dp[i - 2] + dp[i - 1]) % 10007;
		}

		System.out.println(dp[n]);

	}

}
