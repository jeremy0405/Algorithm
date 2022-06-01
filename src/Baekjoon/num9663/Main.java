package Baekjoon.num9663;

/*
	문제    : N-Queen
    유형    : 백트래킹
	난이도   : HARD(G5)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/9663
    날짜    : 22.05.31(o)
    refer  :
*/

import java.util.Scanner;

public class Main {

	static int[][] queen;
	static boolean[][] visited;
	static int n;
	static int answer;

	//todo
	// 어차피 위에서 부터 놓으면 위 한 줄은 이미 퀸이 들어가는 순간 더 이상 퀸을 둘 수 없음
	// 위에서부터 놓기 시작하니까 위쪽 row는 visited를 갱신하거나 할 필요가 없음

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		queen = new int[n][n];
		visited = new boolean[n][n];

		dfs(0);

		System.out.println(answer);

	}

	private static void dfs(int row) {
		if (row == n) {
			answer++;
			return;
		}

		for (int i = 0; i < n; i++) {
			if(!visited[row][i]) {

				queen[row][i] = 1;
				updateVisited(row, i);

				dfs(row + 1);

				queen[row][i] = 0;

//				visited = new boolean[n][n]; -> 메모리 초과
				initVisited();

				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						if (queen[j][k] == 1) {
							updateVisited(j, k);
						}
					}
				}

			}
		}
	}

	private static void initVisited() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				visited[i][j] = false;
			}
		}
	}

	private static void updateVisited(int row, int col) {

		for (int i = row; i < n; i++) {
			visited[i][col] = true;
		}

		int rowTemp = row;
		int colTemp = col;

		while (rowTemp < n && 0 <= colTemp) {
			visited[rowTemp++][colTemp--] = true;
		}

		rowTemp = row;
		colTemp = col;

		while (rowTemp < n - 1 && colTemp < n - 1) {
			visited[++rowTemp][++colTemp] = true;
		}

	}

}
