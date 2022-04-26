package Baekjoon.num1037;

/*
	문제    : BOJ 약수
    유형    :
	난이도   : EASY(S5)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/1595
    날짜    : 22.04.26(o)
    refer  :
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while(T-- > 0) {
			int N = in.nextInt();
			max = N > max ? N : max;
			min = N < min ? N : min;
		}
		System.out.println(max * min);
	}

}
