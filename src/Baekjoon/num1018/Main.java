package Baekjoon.num1018;

/*
	문제    : BOJ 체스판 다시 칠하기
    유형    :
	난이도   : Easy
	시간    : 15m
	uri    : https://www.acmicpc.net/problem/1018
    날짜    : 22.02.13(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static final char[][] answer1 = {
		{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
		{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
		{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
		{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};

	private static final char[][] answer2 = {
		{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
		{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
		{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
		{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}, {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		char[][] board = new char[n][m];

		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < m; j++) {
				board[i][j] = tmp.charAt(j);
			}
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				min = Math.min(checkBoard(board, i, j), min);
			}
		}

		System.out.println(min);

	}

	private static int checkBoard(char[][] board, int i, int j) {

		int count1 = 0;

		for (int k = 0; k < 8; k++) {
			for (int l = 0; l < 8; l++) {
				if (board[i + k][j + l] != answer1[k][l]) {
					count1++;
				}
			}
		}

		int count2 = 0;

		for (int k = 0; k < 8; k++) {
			for (int l = 0; l < 8; l++) {
				if (board[i + k][j + l] != answer2[k][l]) {
					count2++;
				}
			}
		}

		return Math.min(count1, count2);
	}

}
