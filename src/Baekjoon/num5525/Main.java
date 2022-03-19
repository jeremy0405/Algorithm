package Baekjoon.num5525;

/*
	문제    : BOJ IOIOI
    유형    :
	난이도   : EASY(S2)
	시간    : m
	uri    : https://www.acmicpc.net/problem/5525
    날짜    : 22.03.19(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		char[] arr = new char[m];

		char[] p = new char[2 * n + 1];
		for (int i = 0; i < 2 * n; i += 2) {
			p[i] = 'I';
			p[i + 1] = 'O';
		}
		p[2 * n] = 'I';

		for (int i = 0; i < m; i++) {
			arr[i] = (char) br.read();
		}

		int count = 0;
		for (int i = 0; i < m - (2 * n + 1); i++) {
			char[] chars = Arrays.copyOfRange(arr, i, i + 2 * n + 1);
			if (Arrays.compare(chars, p) == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
