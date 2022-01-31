package Baekjoon.num10828;

/*
	문제    : BOJ 스택
    유형    :
	난이도   : Easy
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/10828
    날짜    : 22.01.31(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		Stack<Integer> stack = new Stack<>();

		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			switch (command) {
				case "push":
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (stack.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(stack.pop());
					}
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "top":
					if (stack.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(stack.peek());
					}
					break;
				case "empty":
					if (stack.isEmpty()) {
						System.out.println("1");
					} else {
						System.out.println("0");
					}
					break;
				default:
					break;
			}
		}

	}

}
