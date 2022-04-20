package Baekjoon.num17626;

/*
	문제    : BOJ Four Squares
    유형    : DP
	난이도   : MEDIUM(S4)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/17626
    날짜    : 22.04.21(o)
    refer  :
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int[] dp = new int[number + 1];

		dp[1] = 1;

		for (int i = 2; i <= number; i++) {
			int min = Integer.MAX_VALUE;

			for (int j = 1; j * j <= i; j++) {
				min = Math.min(min, dp[i - j * j]);
			}
			dp[i] = min + 1;
		}

		System.out.println(dp[number]);
	}

}
