package Baekjoon.num1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Sol2 {

	static int n;
	static int m;
	static boolean[][] map;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		map = new boolean[n + 1][n + 1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			map[start][end] = true;
			map[end][start] = true;
		}

		visited = new boolean[n + 1];
		dfs(v);
		System.out.println();
		visited = new boolean[n + 1];
		bfs(v);

	}

	private static void dfs(int start) {

		visited[start] = true;
		System.out.print(start + " ");

		for (int i = 1; i <= n; i++) {
			if (map[start][i] && !visited[i]) {
				dfs(i);
			}
		}

	}

	private static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		visited[start] = true;

		while (!q.isEmpty()) {
			int tmp = q.poll();
			System.out.print(tmp + " ");
			for (int i = 1; i <= n; i++) {
				if (map[tmp][i] && !visited[i]) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
	}

}
