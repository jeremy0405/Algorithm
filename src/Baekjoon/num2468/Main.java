package Baekjoon.num2468;

/*
	문제    : BOJ 안전 영역
    유형    :
	난이도   : (S1)
	시간    : m
	uri    : https://www.acmicpc.net/problem/2468
    날짜    : 22.05.23(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] map;
	static int N;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static boolean[][] visited;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		int max = 0;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, map[i][j]);
			}
		}

		int maxHeight = 0;

		for (int height = 1; height <= max; height++) {
			maxHeight = Math.max(maxHeight, findCountOfIsland(height));
		}

		System.out.println(maxHeight);

	}

	private static int findCountOfIsland(int height) {
		int answer = 0;
		visited = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					answer = Math.max(answer, dfs(i, j, height, answer));
				}
			}
		}

		return answer;
	}

	private static int dfs(int i, int j, int height, int answer) {

		visited[i][j] = true;

		for (int k = 0; k < 4; k++) {
			int newI = i + dx[k];
			int newJ = j + dy[k];

			if (newI < 0 || newJ < 0 || newI >= N || newJ >= N) {
				continue;
			}

			if (!visited[newI][newJ] && map[newI][newJ] >= height) {
				dfs(newI, newJ, height, ++answer);
			}

		}
		return answer;
	}

}
