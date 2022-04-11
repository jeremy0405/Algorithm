package Baekjoon.num1475;

/*
	문제    : BOJ 방 번호
    유형    :
	난이도   : EASY(S5)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/1475
    날짜    : 22.04.11(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		int[] arr = new int[10];

		for (int i = 0; i < input.length(); i++) {
			int num = Integer.parseInt(input.charAt(i) + "");
			arr[num]++;
		}

		arr[6] = arr[6] + arr[9];
		arr[9] = 0;

		int max = 0;
		for (int i = 0; i < 9; i++) {
			if (i == 6) {
				max = Math.max(max, arr[i] / 2 + arr[i] % 2);
				continue;
			}
			max = Math.max(max, arr[i]);
		}

		System.out.println(max);
	}

}
