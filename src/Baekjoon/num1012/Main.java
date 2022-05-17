package Baekjoon.num1012;

/*
	문제    : BOJ 유기농 배추
    유형    :
	난이도   :
	시간    : m
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


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());

		while (repeat-- > 0) {

			String[] split = br.readLine().split(" ");
			int col = Integer.parseInt(split[0]);
			int row = Integer.parseInt(split[1]);
			int number = Integer.parseInt(split[2]);

			boolean[][] visited = new boolean[row][col];
			boolean[][] map = new boolean[row][col];

			for (int i = 0; i < number; i++) {
				String[] s = br.readLine().split(" ");
				map[Integer.parseInt(s[1])][Integer.parseInt(s[0])] = true;
			}

			int count = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (map[i][j] && !visited[i][j]) {
						bfs(col, row, visited, map, i, j);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	private static void bfs(int col, int row, boolean[][] visited, boolean[][] map, int i,
		int j) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{i, j});
		while (!q.isEmpty()) {
			int[] rowCol = q.poll();
			visited[rowCol[0]][rowCol[1]] = true;
			for (int k = 0; k < 4; k++) {
				int newRow = rowCol[0] + dx[k];
				int newCol = rowCol[1] + dy[k];

				if (newRow >= row || newCol >= col || newCol < 0 || newRow < 0) {
					continue;
				}

				if (map[newRow][newCol] && !visited[newRow][newCol]) {
					q.offer(new int[]{newRow, newCol});
				}

			}
		}
	}

}
