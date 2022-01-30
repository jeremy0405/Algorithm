package Baekjoon.num2609;

/*
	문제    : BOJ 최대공약수와 최소공배수
    유형    :
	난이도   : Easy
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/2609
    날짜    : 22.01.30(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	private static int initA;
	private static int initB;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		initA = Integer.parseInt(st.nextToken());
		initB = Integer.parseInt(st.nextToken());

		Set<Integer> aSet = new HashSet<>();
		Set<Integer> bSet = new HashSet<>();
		for (int i = 1; i <= Math.sqrt(initA); i++) {
			if (initA % i == 0) {
				aSet.add(i);
				aSet.add(initA / i);
			}
		}

		for (int i = 1; i <= Math.sqrt(initB); i++) {
			if (initB % i == 0) {
				bSet.add(i);
				bSet.add(initB / i);
			}
		}

		int max = 0;
		for (int intA : aSet) {
			for (int intB : bSet) {
				if (intA == intB) {
					max = Math.max(max, intA);
				}
			}
		}

		System.out.println(max);
		System.out.println(getMin(initA,initB));

		br.close();
	}

	private static int getMin(int a, int b) {
		if (a == b) {
			return a;
		} else if (a > b) {
			b += initB;
			return getMin(a, b);
		} else {
			a += initA;
			return getMin(a, b);
		}
	}

}
