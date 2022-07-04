package Baekjoon.num12865;

/*
	문제    : BOJ 평범한 배낭
    유형    : 배낭 문제, dp
	난이도   : HARD(G5)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/12865
    날짜    : 22.07.04(o)
    refer  : https://st-lab.tistory.com/141
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] W = new int[N + 1];
		int[] V = new int[N + 1];
		int[][] dp = new int[N + 1][K + 1]; // 물품 개수, 가방의 무게
		// dp의 값은 V (가치)의 최대 값

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {

				// i번째 무게를 더 담을 수 없는 경우 -> j가 곧 들 수 있는 무게
				if(W[i] > j) {
					dp[i][j] = dp[i - 1][j];
				}
				// i번째 무게를 더 담을 수 있는 경우
				else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]);
				}

			}
		}
		System.out.println(dp[N][K]);
	}
}
