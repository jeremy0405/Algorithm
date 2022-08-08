package Baekjoon.num1504;

/*
	문제    : BOJ 특정한 최단 경로
    유형    : 다익스트라
	난이도   : MEDIUM (G4)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/1504
    날짜    : 22.08.08(o)
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
		int cost;

		public Node(int index, int cost) {
			this.index = index;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}

	static int n;
	static List<List<Node>> nodes;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		nodes = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			nodes.add(new ArrayList<>());
		}

		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			nodes.get(a).add(new Node(b, c));
			nodes.get(b).add(new Node(a, c));
		}

		st = new StringTokenizer(br.readLine());
		int v1 = Integer.parseInt(st.nextToken());
		int v2= Integer.parseInt(st.nextToken());

		// 1 -> v1 -> v2 -> n
		int sum1 = 0;
		sum1 += dijkstra(1, v1);
		sum1 += dijkstra(v1, v2);
		sum1 += dijkstra(v2, n);

		//1 -> v2 -> v1 -> n
		int sum2 = 0;
		sum2 += dijkstra(1, v2);
		sum2 += dijkstra(v2, v1);
		sum2 += dijkstra(v1, n);

		if (sum1 >= 500_000_000 && sum2 >= 500_000_000) {
			System.out.println(-1);
			return;
		}
		System.out.println(Math.min(sum1, sum2));
	}

	private static int dijkstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[n + 1];
		int[] d = new int[n + 1];
		Arrays.fill(d, 500_000_000);
		pq.add(new Node(start, 0));
		d[start] = 0;

		while (!pq.isEmpty()) {
			Node now = pq.poll();
			int index = now.index;

			if (!visited[index]) {
				visited[index] = true;
				for (Node node : nodes.get(index)) {
					if (!visited[node.index] && d[node.index] > d[index] + node.cost) {
						d[node.index] = d[index] + node.cost;
						pq.add(new Node(node.index, d[node.index]));
					}
				}
			}
		}
		return d[end];
	}

}
