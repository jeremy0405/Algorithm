package Baekjoon.num11286;

/*
	문제    : BOJ 절댓값 힙
    유형    : 우선순위 큐
	난이도   : MEDIUM(S1)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/11286
    날짜    : 22.04.05(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) ->
			Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2))
		);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				sb.append(que.isEmpty() ? 0 : que.poll()).append('\n');
			} else {
				que.add(num);
			}
		}
		System.out.println(sb);
	}
}
