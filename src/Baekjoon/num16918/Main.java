package Baekjoon.num16918;

/*
	문제    : BOJ 봄버맨
    유형    : 구현, 그래프 이론, 그래프 탐색, 시뮬레이션
	난이도   : HARD(S1)
	시간    : 120m
	uri    : https://www.acmicpc.net/problem/16918
    날짜    : 22.03.27(o)
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
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		if (n % 2 == 0) {
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					System.out.print("O");
				}
				System.out.println();
			}
			return;
		}

		char[][] arr = new char[r + 2][c + 2];

		for (int i = 0; i < r; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < c; j++) {
				arr[i + 1][j + 1] = tmp.charAt(j);
			}
		}

		if (n == 1) {
			for (int i = 1; i < r + 1; i++) {
				for (int j = 1; j < c + 1; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			return;
		}

		char[][] arr2 = new char[r + 2][c + 2];

		for (int i = 0; i < r + 2; i++) {
			for (int j = 0; j < c + 2; j++) {
				arr2[i][j] = 'O';
			}
		}

		for (int i = 1; i < r + 1; i++) {
			for (int j = 1; j < c + 1; j++) {
				if (arr[i][j] == 'O') {
					arr2[i + 1][j] = '.';
					arr2[i - 1][j] = '.';
					arr2[i][j + 1] = '.';
					arr2[i][j - 1] = '.';
					arr2[i][j] = '.';
				}
			}
		}

		if (n % 4 == 3) {
			for (int i = 1; i < r + 1; i++) {
				for (int j = 1; j < c + 1; j++) {
					System.out.print(arr2[i][j]);
				}
				System.out.println();
			}
			return;
		}

		char[][] arr3 = new char[r + 2][c + 2];

		for (int i = 0; i < r + 2; i++) {
			for (int j = 0; j < c + 2; j++) {
				arr3[i][j] = 'O';
			}
		}

		if (n % 4 == 1) {
			for (int i = 1; i < r + 1; i++) {
				for (int j = 1; j < c + 1; j++) {
					if (arr2[i][j] == 'O') {
						arr3[i + 1][j] = '.';
						arr3[i - 1][j] = '.';
						arr3[i][j + 1] = '.';
						arr3[i][j - 1] = '.';
						arr3[i][j] = '.';
					}
				}
			}

			for (int i = 1; i < r + 1; i++) {
				for (int j = 1; j < c + 1; j++) {
					System.out.print(arr3[i][j]);
				}
				System.out.println();
			}
		}

	}

}
