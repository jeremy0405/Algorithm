package Baekjoon.num1260;

/*
	문제    : BOJ DFS와 BFS
    유형    : dfs, bfs
	난이도   : MEDIUM(S2)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/1260
    날짜    : 22.03.06(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int totalNode;
	static int totalLine;
	static int startNode;
	static int[][] arr;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		totalNode = Integer.parseInt(st.nextToken());
		totalLine = Integer.parseInt(st.nextToken());
		startNode = Integer.parseInt(st.nextToken());

		arr = new int[totalNode + 1][totalNode + 1];
		visited = new boolean[totalNode + 1];

		for (int i = 0; i < totalLine; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			arr[start][end] = 1;
			arr[end][start] = 1;
		}

		dfs(startNode);
		System.out.println();
		visited = new boolean[totalNode + 1];
		bfs(startNode);
	}

	private static void dfs(int startNode) {
		System.out.print(startNode + " ");
		visited[startNode] = true;

		for (int i = 1; i <= totalNode; i++) {
			if (arr[startNode][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}

	private static void bfs(int startNode) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(startNode);

		while (!queue.isEmpty()) {

			int tmp = queue.poll();
			System.out.print(tmp + " ");
			visited[tmp] = true;

			for (int i = 1; i <= totalNode; i++) {
				if(arr[tmp][i] == 1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}

		}

	}

}
