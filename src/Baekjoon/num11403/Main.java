package Baekjoon.num11403;

/*
	문제    : BOJ 경로 찾기
    유형    : 그래프이론, 플로이드 와샬
	난이도   : EASY(S1)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/11403
    날짜    : 22.03.17(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] input = new int[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				input[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (input[i][j] == 0 && input[i][k] * input[k][j] == 1) {
						input[i][j] = 1;
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(input[i][j]).append(" ");
			}
			sb.append(System.lineSeparator());
		}

		System.out.println(sb);
		br.close();

	}

}
