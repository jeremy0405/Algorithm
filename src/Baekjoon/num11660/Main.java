package Baekjoon.num11660;

/*
	문제    : 구간 합 구하기 5
    유형    : dp
	난이도   : MEDIUM(S1)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/11660
    날짜    : 22.05.28(o)
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
		int m = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n + 1][n + 1];
		int[][] dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			for (int j = 1; j <= n; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				arr[i][j] = tmp;
				sum += tmp;
				dp[i][j] = dp[i - 1][j] + sum;
			}
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			System.out.println(dp[x2][y2] + dp[x1 - 1][y1 - 1] - dp[x1 - 1][y2] - dp[x2][y1 - 1]);
		}

	}

}
