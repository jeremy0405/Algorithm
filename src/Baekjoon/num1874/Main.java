package Baekjoon.num1874;

/*
	문제    : BOJ 스택 수열
    유형    :
	난이도   : MEDIUM (S3)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/1874
    날짜    : 22.02.24(o)
    refer  :
*/

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int n = sc.nextInt();

		int[] arr = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}


		int tmp = 1;
		for (int i = 1; i <= n; i++) {
			stack.push(i);
			sb.append("+").append(System.lineSeparator());
			while (!stack.isEmpty() && arr[tmp] == stack.peek()) {
				stack.pop();
				sb.append("-").append(System.lineSeparator());
				tmp++;
			}
		}

		if (stack.empty()) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}

	}

}
