package Baekjoon.num2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main3 {

	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int[][] map;
	static boolean[][] visited;
	static List<String> answers = new ArrayList<>();

	static int n;
	static int m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}

		dfs(0, 0, "");

		int min = 987654321;

		for (String answer : answers) {
			System.out.println(answer);
			min = Math.min(answer.length(), min);
		}

		System.out.println(min);

	}

	private static void dfs(int i, int j, String path) {

		visited[i][j] = true;
		path += map[i][j];

		if (i == n - 1 && j == m - 1) {
			answers.add(path);
			visited[i][j] = false;
			return;
		}

		for (int k = 0; k < 4; k++) {
			int newX = i + dx[k];
			int newY = j + dy[k];

			if (newX < 0 || newY < 0 || newX >= n || newY >= m) {
				continue;
			}

			if (map[newX][newY] == 1 && !visited[newX][newY]) {
				dfs(newX, newY, path);
			}

		}

		visited[i][j] = false;

	}


}
