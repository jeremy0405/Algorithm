package Baekjoon.num2292;

/*
	문제    : BOJ 벌집
    유형    :
	난이도   : Easy (B2)
	시간    : 15m
	uri    : https://www.acmicpc.net/problem/2292
    날짜    : 22.02.14(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 1, 7, 19, 37  61
		//   6  12  18  24
		int count = 1;
		int tmp = 1;

		while (tmp < n) {
			tmp += 6 * count;
			count++;
		}

		System.out.println(count);


	}

}
