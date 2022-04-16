package Baekjoon.num1932;

/*
	문제    : BOJ 정수 삼각형
    유형    : DP
	난이도   : EASY(S1)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/1932
    날짜    : 22.04.17(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());

		int[][] tri = new int[total + 1][total + 1];
		int[][] dp = new int[total + 1][total + 1];

		for (int i = 1; i <= total; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= i; j++) {
				tri[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dp[1][1] = tri[1][1];

		for (int i = 2; i <= total; i++) {

			for (int j = 1; j <= i; j++) {
				dp[i][j] = Math.max(dp[i - 1][j - 1] + tri[i][j], dp[i - 1][j] + tri[i][j]);
			}

		}


		int max = 0;
		for (int value : dp[total]) {
			max = Math.max(value, max);
		}

		System.out.println(max);

	}

}
