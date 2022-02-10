package Baekjoon.num11866;

/*
	문제    : BOJ 요세푸스 문제 0
    유형    :
	난이도   : Easy
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/11866
    날짜    : 22.02.11(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		Queue<Integer> queue = new LinkedList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);

		for (int i = 0; i < n; i++) {
			queue.add(i + 1);
		}

		StringBuilder sb = new StringBuilder();

		sb.append("<");

		while (!queue.isEmpty()) {
			for (int i = 0; i < k - 1; i++) {
				queue.add(queue.poll());
			}
			sb.append(queue.poll()).append(", ");
		}

		sb.delete(sb.length() - 2, sb.length());
		sb.append(">");

		System.out.println(sb);

		br.close();

	}

}
