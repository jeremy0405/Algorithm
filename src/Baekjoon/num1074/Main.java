package Baekjoon.num1074;

/*
	문제    : BOJ Z
    유형    : 분할 정복, 재귀
	난이도   : MEDIUM(S1)
	시간    : 60m
	uri    : https://www.acmicpc.net/problem/1074
    날짜    : 22.04.30(o)
    refer  :
*/

import java.util.Scanner;

public class Main {

	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();

		int size = (int) Math.pow(2, N);

		answer(size, r, c);

		System.out.println(count);
	}

	private static void answer(int size, int r, int c) {
		if (size == 1) {
			return;
		}

		int newSize = size / 2;

		if (r < newSize && c < newSize) {
			answer(newSize, r, c);
		} else if (r < newSize && c >= newSize) {
			count += size * size / 4;
			answer(newSize, r, c - newSize);
		} else if (r >= newSize && c < newSize) {
			count += size * size / 2;
			answer(newSize, r - newSize, c);
		} else {
			count += size * size / 4 * 3;
			answer(newSize, r - newSize, c - newSize);
		}

	}

}
