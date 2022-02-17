package Baekjoon.num1654;

/*
	문제    : BOJ 덩치
    유형    : 구현, 브루트포스
	난이도   : HARD (풀고나니 Medium ~ EASY) (S5)
	시간    : 120m
	uri    : https://www.acmicpc.net/problem/7568
    날짜    : 22.02.16(x)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int k = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);

		int[] lan = new int[k];
		int total = 0;

		for (int i = 0; i < k; i++) {
			int tmp = Integer.parseInt(br.readLine());
			lan[i] = tmp;
			total += tmp;
		}

		int maxLength = total / n;
		final int MAX_LENGTH = maxLength;
		int num = 0;
		while (num != n) {
			num = 0;

			for (int i = 0; i < k; i++) {
				num += lan[i] / maxLength;
			}

			if (num > n) {
				maxLength = (MAX_LENGTH + maxLength) / 2 - 1;
			} else if (num < n) {
				maxLength = maxLength / 2 + 1;
			}

		}

		System.out.println(maxLength);

	}

}
