package Baekjoon.num9252;

/*
	문제    : BOJ LCS2
    유형    : DP
	난이도   : HARD (G4)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/9252
    날짜    : 22.08.17(o)
    refer  :
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
				if (input2[i - 1] == input1[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		int answer = dp[input2.length][input1.length];
		System.out.println(answer);
		if (answer == 0) {
			return;
		}

		int[] dx = {0, -1};
		int[] dy = {-1, 0};

		int x = input1.length;
		int y = input2.length;

		StringBuilder sb = new StringBuilder();

		while (answer > 0) {

			int nx = x + dx[1];
			int ny = y + dy[1];

			int nnx = x + dx[0];
			int nny = y + dy[0];

			if (dp[ny][nx] == answer) {
				x = nx;
				y = ny;
				continue;
			}

			if (dp[nny][nnx] == answer) {
				x = nnx;
				y = nny;
				continue;
			}
			answer--;
			sb.append(input1[x - 1]);
			x = x - 1;
			y = y - 1;
		}

		System.out.println(sb.reverse());

	}
}


