package Baekjoon.num2775;

/*
	문제    : BOJ 부녀회장이 될테야
    유형    :
	난이도   : Easy
	시간    : 15m
	uri    : https://www.acmicpc.net/problem/2775
    날짜    : 22.02.07(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());


		for (int i = 0; i < testCase; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(foo(k, n + 1));
		}

		br.close();
	}

	private static int foo(int k, int n) {

		//2floor 1 4 10 20 35
		//1floor 1 3 6 10 15 21
		//0floor 1 2 3 4 5 6

		int[][] arr = new int[k + 1][n + 1];

		for (int i = 1; i < n + 1; i++) {
			arr[0][i] = i;
		}

		for (int i = 1; i < k + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				for (int l = 0; l <= j; l++) {
					arr[i][j] += arr[i - 1][l];
				}
			}
		}

		return arr[k][n - 1];
	}

}
