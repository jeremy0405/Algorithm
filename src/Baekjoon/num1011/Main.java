package Baekjoon.num1011;

/*
	문제    : BOJ Fly me to the Alpha Centauri
    유형    : 수학
	난이도   : MEDIUM (G5)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/1011
    날짜    : 22.07.18(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		//todo
		// 1 = 1 -> 1
		// 1 1 = 2 -> 2
		// 3
		// 1 2 1 = 4 -> 3        2 * 2 - 1
		// 4
		// 1 2 2 1 = 6 -> 4      2 * 2
		// 5
		// 1 2 3 2 1 = 9 -> 5    3 * 2 - 1
		// 6
		// 1 2 3 3 2 1 = 12 -> 6
		// 7
		// 1 2 3 4 3 2 1 = 16 -> 7
		// 1 2 3 4 4 3 2 1 = 20 -> 8
		// 1 2 3 4 5 4 3 2 1 = 25 -> 9

		while (testCase-- > 0) {
			String[] input = br.readLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int end = Integer.parseInt(input[1]);
			printAnswer(end - start);
		}
	}

	private static void printAnswer(int gap) {
		int sqrt = (int) Math.sqrt(gap);

		if (gap <= sqrt * sqrt) {
			System.out.println(sqrt * 2 - 1);
			return;
		}
		if (gap <= sqrt * sqrt + sqrt) {
			System.out.println(sqrt * 2);
			return;
		}
		System.out.println(sqrt * 2 + 1);
	}

}
