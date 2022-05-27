package Baekjoon.num11660;

/*
	문제    : 구간 합 구하기 5
    유형    : 구현
	난이도   : S1
	시간    : m
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

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			printAnswer(x1, y1, x2, y2, arr);
		}

	}

	private static void printAnswer(int x1, int y1, int x2, int y2, int[][] arr) {

		int answer = 0;

		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				answer += arr[i][j];
			}
		}

		System.out.println(answer);

	}

}
