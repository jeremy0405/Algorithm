package Baekjoon.num1647;

/*
	문제    : BOJ 도시 분할 계획
    유형    : 그래프
	난이도   : HARD (G4)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/1647
    날짜    : 22.08.09(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static class Road implements Comparable<Road> {
		int start;
		int end;
		int cost;

		public Road(int start, int end, int cost) {
			this.start = start;
			this.end = end;
			this.cost = cost;
		}

		@Override
		public int compareTo(Road o) {
			return this.cost - o.cost;
		}
	}

	static int[] parents;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		List<Road> roads = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			roads.add(new Road(start, end, cost));
		}

		Collections.sort(roads);

		parents = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			parents[i] = i;
		}

		int max = 0;
		int sum = 0;
		for (Road road : roads) {
			int a = road.start;
			int b = road.end;

			if (findRoot(a) != findRoot(b)) {
				union(a, b);
				sum += road.cost;
				max = road.cost;
			}
		}

		System.out.println(sum - max);
	}

	private static void union(int a, int b) {
		a = findRoot(a);
		b = findRoot(b);

		if (a < b) {
			parents[b] = a;
		} else {
			parents[a] = b;
		}
	}

	private static int findRoot(int a) {
		if (parents[a] == a) {
			return a;
		}
		parents[a] = findRoot(parents[a]);
		return parents[a];
	}

}
