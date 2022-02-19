package Baekjoon.num1676;

/*
	문제    : BOJ 팩토리얼 0의 개수
    유형    :
	난이도   : EASY (S4)
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/1676
    날짜    : 22.02.19(o)
    refer  : https://www.geeksforgeeks.org/biginteger-class-in-java/
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger fac = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		String answer = fac.toString();

		int maxLength = answer.length() - 1;
		int count = 0;
		while (true) {
			if (answer.charAt(maxLength) == '0') {
				count++;
			} else {
				break;
			}
			maxLength--;
		}
		System.out.println(count);
	}

}
