package Baekjoon.num10026;

/*
	문제    : BOJ 적록색약
    유형    : dfs, bfs
	난이도   : MEDIUM(G5)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/10026
    날짜    : 22.05.10(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int size;
	static char[][] rgb;
	static char[][] rb;
	static boolean[][] visited;
	static int rgbCount;
	static int rbCount;

	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());
		rgb = new char[size][size];
		rb = new char[size][size];
		visited = new boolean[size][size];

		for (int i = 0; i < size; i++) {
			String s = br.readLine();
			for (int j = 0; j < size; j++) {
				char c = s.charAt(j);
				rgb[i][j] = c;
				if (c == 'G') {
					rb[i][j] = 'R';
				} else {
					rb[i][j] = c;
				}
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (!visited[i][j]) {
					dfs(i, j, rgb);
					rgbCount++;
				}
			}
		}

		visited = new boolean[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (!visited[i][j]) {
					dfs(i, j, rb);
					rbCount++;
				}
			}
		}

		System.out.println(rgbCount + " " + rbCount);

	}

	private static void dfs(int i, int j, char[][] map) {
		visited[i][j] = true;
		char refer = map[i][j];

		for (int k = 0; k < 4; k++) {
			int x = i + dx[k];
			int y = j + dy[k];

			if (x < 0 || y < 0 || x >= size || y >= size) {
				continue;
			}

			if (!visited[x][y] && map[x][y] == refer) {
				dfs(x, y, map);
			}

		}
	}

}
