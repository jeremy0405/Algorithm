package Baekjoon.num10866;
/*
	문제    : BOJ 덱
    유형    :
	난이도   : Easy
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/10866
    날짜    : 22.02.02(o)
    refer  :
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		Deque<Integer> queue = new LinkedList<>();

		int n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			switch (command) {
				case "push_front":
					queue.addFirst(Integer.parseInt(st.nextToken()));
					break;
				case "push_back":
					queue.addLast(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front":
					if (queue.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(queue.pollFirst());
					}
					break;
				case "pop_back":
					if (queue.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(queue.pollLast());
					}
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "front":
					if (queue.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(queue.getFirst());
					}
					break;
				case "back":
					if (queue.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(queue.getLast());
					}
					break;
				case "empty":
					if (queue.isEmpty()) {
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

