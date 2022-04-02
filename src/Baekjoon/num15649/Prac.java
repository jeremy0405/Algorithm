package Baekjoon.num15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac {

	static boolean[] visited;
	static int[] arr;
	static int n;
	static int m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);

		visited = new boolean[n];
		arr = new int[m];

		dfs(0);
		System.out.println(sb);

	}

	private static void dfs(int depth) {

		if (depth == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append(System.lineSeparator());
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				visited[i] = false;
			}
		}

	}

}
