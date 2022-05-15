package Baekjoon.num11404;

/*
	문제    : BOJ 플로이드
    유형    : 플로이드 와샬
	난이도   : MEDIUM(G4)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/11404
    날짜    : 22.05.15(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		int[][] map = new int[n + 1][n + 1];
		int INF = 987654321;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					continue;
				}
				map[i][j] = INF;
			}
		}

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			map[start][end] = Math.min(map[start][end], cost);
		}

		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
				}
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (map[i][j] == INF) {
					sb.append("0 ");
				} else {
					sb.append(map[i][j] + " ");
				}
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
