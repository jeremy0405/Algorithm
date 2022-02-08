package Baekjoon.num1436;

/*
	문제    : BOJ 영화감독 숌
    유형    :
	난이도   : Easy
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/1436
    날짜    : 22.02.08(o)
    refer  :
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		int start = 666;

		while (n != count) {

			if (String.valueOf(start).contains("666")) {
				count++;
			}

			start++;
		}

		System.out.println(start - 1);

	}

}
