package Baekjoon.num10830;

/*
	문제    : BOJ 행렬 제곱
    유형    : 분할 정복
	난이도   : HARD (G4)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/10830
    날짜    : 22.06.09(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		long B = Long.parseLong(st.nextToken());

		int[][] arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()) % 1000;
			}
		}

		int[][] result = pow(arr, B);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int[][] pow(int[][] arr, long b) {

		if (b == 1) {
			return arr;
		}

		int[][] result = pow(arr, b / 2);

		if (b % 2 == 0) {
			return multiply(result, result);
		} else {
			return multiply(multiply(result, result), arr);
		}
	}

	private static int[][] multiply(int[][] a, int[][] b) {

		int[][] tmp = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					tmp[i][j] += a[i][k] * b[k][j];
					tmp[i][j] %= 1000;
				}
			}
		}
		return tmp;
	}

}
