package Baekjoon.num11724;

/*
	문제    : BOJ 연결 요소의 개수
    유형    : bfs, dfs
	난이도   : 연결 요소의 개수(S3)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/11724
    날짜    : 22.03.26(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int[][] arr;
	static boolean[] visited;
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		arr = new int[n + 1][n + 1];
		visited = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			arr[start][end] = 1;
			arr[end][start] = 1;
		}

		bfs();

		System.out.println(count);

	}

	private static void bfs() {
		for (int i = 1; i <= n; i++) {
			if (!visited[i]){
				Queue<Integer> q = new LinkedList<>();
				visited[i] = true;
				q.add(i);

				while (!q.isEmpty()) {
					int num = q.poll();
					for (int j = 1; j <= n; j++) {
						if (arr[num][j] == 1 && !visited[j]) {
							visited[j] = true;
							q.add(j);
						}
					}
				}
				count++;
			}

		}

	}

}
