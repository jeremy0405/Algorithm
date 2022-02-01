package Baekjoon.num10845;public class Main {
package Baekjoon.num10845;

/*
	문제    : BOJ 큐
    유형    :
	난이도   : Easy
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/10845
    날짜    : 22.02.01(o)
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
				case "push":
					queue.add(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (queue.isEmpty()) {
						System.out.println("-1");
					} else {
						System.out.println(queue.poll());
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


