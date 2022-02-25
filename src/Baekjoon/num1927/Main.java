package Baekjoon.num1927;

/*
	문제    : BOJ 최소 힙
    유형    : 자료구조, 우선순위 큐
	난이도   : EASY(S2)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/1927
    날짜    : 22.02.27(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if (tmp == 0 && !queue.isEmpty()) {
				bw.write(queue.poll() + "\n");
			} else if (tmp != 0) {
				queue.add(tmp);
			} else {
				bw.write(0 + "\n");
			}
		}

		bw.flush();
		br.close();
		bw.close();

	}

}
