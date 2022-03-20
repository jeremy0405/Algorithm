package Baekjoon.num5525;

/*
	문제    : BOJ IOIOI
    유형    :
	난이도   : MEDIUM(S2)
	시간    : 60m
	uri    : https://www.acmicpc.net/problem/5525
    날짜    : 22.03.20(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();

		int[] repeat = new int[m];

		int count = 0;

		for (int i = 1; i < m - 1; i++) {
			if (arr[i] == 'O' && arr[i + 1] == 'I') {
				repeat[i + 1] = repeat[i - 1] + 1;
				if (repeat[i + 1] >= n && arr[i - 2 * n + 1] == 'I') {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
