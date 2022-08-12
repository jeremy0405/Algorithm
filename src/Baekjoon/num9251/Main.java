package Baekjoon.num9251;

/*
	문제    : BOJ LCS
    유형    : LCS, dp
	난이도   : HARD(G5)
	시간    : 60+m
	uri    : https://www.acmicpc.net/problem/9251
    날짜    : 22.08.12(o)
    refer  : https://velog.io/@emplam27/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B7%B8%EB%A6%BC%EC%9C%BC%EB%A1%9C-%EC%95%8C%EC%95%84%EB%B3%B4%EB%8A%94-LCS-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Longest-Common-Substring%EC%99%80-Longest-Common-Subsequence
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input1 = br.readLine().toCharArray();
		char[] input2 = br.readLine().toCharArray();

		int[][] dp = new int[input2.length + 1][input1.length + 1];

		for (int i = 1; i <= input2.length; i++) {
			for (int j = 1; j <= input1.length; j++) {
				if (input1[j - 1] == input2[i - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		System.out.println(dp[input2.length][input1.length]);

	}
}
