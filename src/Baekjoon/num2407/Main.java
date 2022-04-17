package Baekjoon.num2407;

/*
	문제    : BOJ 조합
    유형    :
	난이도   : EASY(S3)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/2407
    날짜    : 22.04.18(o)
    refer  :
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		BigInteger answer = BigInteger.ONE;

		long count = 1L;
		for (long i = n; i > n - m; i--) {
			answer = answer.multiply(BigInteger.valueOf(i))
				.divide(BigInteger.valueOf(count));
			count++;
		}

		System.out.println(answer);

	}

}
