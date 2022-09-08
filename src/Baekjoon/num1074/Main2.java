package Baekjoon.num1074;

/*
	문제    : BOJ Z
    유형    : 분할 정복, 재귀
	난이도   : EASY (S1)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/1074
    날짜    : 22.09.08(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	static int answer = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int r = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);

		n = (int) Math.pow(2, n);

		findAnswer(n, r, c);

		System.out.println(answer);
	}

	private static void findAnswer(int n, int r, int c) {
		if (n == 1) {
			return;
		}
		int size = n / 2;

		if (r < size && c < size) {
			findAnswer(size, r, c);
		} else if (r < size && c >= size) {
			answer += n * n / 4;
			findAnswer(size, r, c - size);
		} else if (r >= size && c < size) {
			answer += n * n / 2;
			findAnswer(size, r - size, c);
		} else {
			answer += n * n / 4 * 3;
			findAnswer(size, r - size, c - size);
		}
	}
}
