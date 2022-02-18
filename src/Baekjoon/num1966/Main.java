package Baekjoon.num1966;

/*
	문제    : BOJ 프린터 큐
    유형    :
	난이도   : EASY (S3)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/1966
    날짜    : 22.02.18(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		Deque<List<Integer>> queue;
		List<Integer> priority;

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			queue = new LinkedList<>();
			priority = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int p = Integer.parseInt(st.nextToken());
				queue.add(List.of(p, j));
				priority.add(p);
			}

			priority.sort(Collections.reverseOrder());

			for (int j = 0; j < n; j++) {
				int p = priority.get(j);
				while (true) {
					List<Integer> info = queue.pollFirst();
					if (p == info.get(0)) {
						if (idx == info.get(1)) {
							bw.write((j + 1) + "\n");
						}
						break;
					} else {
						queue.add(info);
					}

				}
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
