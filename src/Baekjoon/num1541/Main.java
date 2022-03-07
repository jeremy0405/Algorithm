package Baekjoon.num1541;

/*
	문제    : BOJ 잃어버린 괄호
    유형    :
	난이도   : EASY(S2)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/1541
    날짜    : 22.03.07(o)
    refer  :
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] split = input.split("-");

		int[] result = new int[split.length];

		for (int i = 0; i < split.length; i++) {
			int tmp = 0;
			String[] plusNumbers = split[i].split("\\+");
			for (int j = 0; j < plusNumbers.length; j++) {
				tmp += Integer.parseInt(plusNumbers[j]);
			}
			result[i] = tmp;
		}

		int answer = 0;

		for (int i = 0; i < result.length; i++) {
			answer -= result[i];
		}

		answer += result[0] * 2;

		System.out.println(answer);
	}

}
