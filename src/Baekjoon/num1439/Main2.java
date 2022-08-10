package Baekjoon.num1439;

/*
	문제    : BOJ 문자열 뒤집기
    유형    : 그리디
	난이도   : MEDIUM (S5)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/1439
    날짜    : 22.08.10(o)
    refer  :
*/

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] inputs = sc.next().toCharArray();

		int count0 = 0;
		int count1 = 0;

		if (inputs[0] == '0') {
			count1++;
		} else {
			count0++;
		}

		for (int i = 1; i < inputs.length; i++) {
			if (inputs[i - 1] != inputs[i]) {
				if (inputs[i] == '0') {
					count1++;
				} else {
					count0++;
				}
			}
		}

		System.out.println(Math.min(count0, count1));
	}
}
