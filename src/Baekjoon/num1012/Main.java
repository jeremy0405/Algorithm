package Baekjoon.num1012;

/*
	문제    : BOJ 유기농 배추
    유형    : bfs, dfs
	난이도   : MEDIUM(S2)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/1012
    날짜    : 22.05.17(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int col;
	static int row;
	static boolean[][] visited;
	static boolean[][] map;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());

		while (repeat-- > 0) {

			String[] split = br.readLine().split(" ");
			col = Integer.parseInt(split[0]);
			row = Integer.parseInt(split[1]);
			int number = Integer.parseInt(split[2]);

			visited = new boolean[row][col];
			map = new boolean[row][col];

			for (int i = 0; i < number; i++) {
				String[] s = br.readLine().split(" ");
				map[Integer.parseInt(s[1])][Integer.parseInt(s[0])] = true;
			}

			int count = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (map[i][j] && !visited[i][j]) {
						bfs(i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	private static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<>();

		q.offer(new int[]{i, j});
		visited[i][j] = true;

		while (!q.isEmpty()) {
			int[] rowCol = q.poll();

			for (int k = 0; k < 4; k++) {
				int newRow = rowCol[0] + dx[k];
				int newCol = rowCol[1] + dy[k];

				if (newRow >= row || newCol >= col || newCol < 0 || newRow < 0) {
					continue;
				}

				if (map[newRow][newCol] && !visited[newRow][newCol]) {
					q.offer(new int[]{newRow, newCol});
					visited[newRow][newCol] = true;
				}

			}
		}
	}

}
