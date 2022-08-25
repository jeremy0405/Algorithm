package Baekjoon.num2293;

/*
	문제    : BOJ 동전 1
    유형    : DP
	난이도   : MEDIUM (G5)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/2293
    날짜    : 22.08.26(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] dp = new int[k + 1];

		dp[0] = 1;

		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			for (int j = tmp; j <= k; j++) {
				dp[j] += dp[j - tmp];
			}
		}

		System.out.println(dp[k]);
	}

}
