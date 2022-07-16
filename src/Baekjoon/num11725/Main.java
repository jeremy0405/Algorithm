package Baekjoon.num11725;

/*
	문제    : BOJ 트리의 부모 찾기
    유형    : 재귀, 트리, 그래프 탐색
	난이도   : HARD (S2)
	시간    : 50m
	uri    : https://www.acmicpc.net/problem/11725
    날짜    : 22.07.17(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		List<Integer>[] graph = new ArrayList[n + 1];
		for (int i = 0; i < n + 1; i++) {
			graph[i] = new ArrayList<>();
		}

		StringTokenizer st;
		for (int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			graph[start].add(end);
			graph[end].add(start);
		}

		int[] answer = new int[n + 1];
		boolean[] visited = new boolean[n + 1];

		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		visited[1] = true;
		while (!q.isEmpty()) {
			int node = q.poll();
			for (int connectedNode : graph[node]) {
				if (!visited[connectedNode]) {
					visited[connectedNode] = true;
					answer[connectedNode] = node;
					q.add(connectedNode);
				}
			}
		}

		for (int i = 2; i < n + 1; i++) {
			System.out.println(answer[i]);
		}

	}

}
