package Baekjoon.num1427;

/*
	문제    : BOJ 소트인사이드
    유형    :
	난이도   : EASY(S5)
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/1427
    날짜    : 22.03.28(o)
    refer  :
*/


import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		char[] c = s.toCharArray();
		Arrays.sort(c);

		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}

	}

}
