package Baekjoon.num1094;

/*
	문제    : BOJ 막대기
    유형    :
	난이도   : EASY(S5)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/1094
    날짜    : 22.04.01(o)
    refer  :
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		String s = Integer.toBinaryString(num);

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}

		System.out.println(count);

	}

}
