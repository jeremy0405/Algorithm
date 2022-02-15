package Baekjoon.num1929;

/*
	문제    : BOJ 소수 구하기
    유형    :
	난이도   : Medium (S2)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/1929
    날짜    : 22.02.15(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");

		int m = Integer.parseInt(tmp[0]);
		int n = Integer.parseInt(tmp[1]);

		boolean[] notPrime = new boolean[n + 1];

		notPrime[0] = true;
		notPrime[1] = true;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			for (int j = i * i; j <= n; j += i) {
				notPrime[j] = true;
			}
		}

		for (int i = m; i <= n; i++) {
			if (!notPrime[i]) {
				System.out.println(i);
			}
		}

	}

}
