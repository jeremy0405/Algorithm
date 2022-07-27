package Baekjoon.num1753;

/*
	문제    : BOJ 최단경로
    유형    : 다익스트라
	난이도   : MEDIUM(G4)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/1753
    날짜    : 22.07.27(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static class Node implements Comparable<Node> {

		int index;
		int value;

		public Node(int index, int value) {
			this.index = index;
			this.value = value;
		}

		@Override
		public int compareTo(Node o) {
			return this.value - o.value;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(br.readLine());

		List<List<Node>> map = new ArrayList<>();
		for (int i = 0; i <= v; i++) {
			map.add(new ArrayList<>());
		}

		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			map.get(s).add(new Node(t, w));
		}

		boolean[] visited = new boolean[v + 1];
		int[] answer = new int[v + 1];
		Arrays.fill(answer, 987654321);

		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start, 0));
		answer[start] = 0;

		while (!pq.isEmpty()) {
			Node now = pq.poll();

			if (!visited[now.index]) {
				visited[now.index] = true;

				for (Node node : map.get(now.index)) {
					if (!visited[node.index] && answer[node.index] > answer[now.index] + node.value) {
						answer[node.index] = answer[now.index] + node.value;
						pq.add(new Node(node.index, answer[node.index]));
					}
				}

			}

		}

		for (int i = 1; i <= v; i++) {
			int out = answer[i];
			if (out == 987654321) {
				System.out.println("INF");
			} else {
				System.out.println(out);
			}

		}
	}

}
