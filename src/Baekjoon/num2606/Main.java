package Baekjoon.num2606;

/*
	문제    : BOJ 바이러스
    유형    : 그래프 탐색
	난이도   : MEDIUM (S3)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/2606
    날짜    : 22.02.21(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int[][] node = new int[n + 1][n + 1];
		int[] visited = new int[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			node[a][b] = 1;
			node[b][a] = 1;
		}

		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		visited[1] = 1;

		int count = 0;
		while (!queue.isEmpty()) {
			int x = queue.poll();

			for (int i = 1; i < node.length; i++) {
				if(node[x][i] == 1 && visited[i] != 1) {
					queue.add(i);
					visited[i] = 1;
					count++;
				}
			}

		}

		System.out.println(count);

	}
}
