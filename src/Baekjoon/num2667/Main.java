package Baekjoon.num2667;

/*
	문제    : BOJ 단지번호붙이기
    유형    : bfs, dfs
	난이도   : MEDIUM(S1)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/2667
    날짜    : 22.05.07(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	static int mapSize;
	static int[][] map;
	static boolean[][] visited;
	static List<Integer> answer = new ArrayList<>();

	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		mapSize = Integer.parseInt(br.readLine());
		map = new int[mapSize][mapSize];
		visited = new boolean[mapSize][mapSize];

		for (int i = 0; i < mapSize; i++) {
			String info = br.readLine();
			for (int j = 0; j < mapSize; j++) {
				map[i][j] = Integer.parseInt(info.charAt(j) + "");
			}
		}

		for (int i = 0; i < mapSize; i++) {
			for (int j = 0; j < mapSize; j++) {
				int out = method(i, j, 0);
				if (out != 0) {
					answer.add(out);
				}
			}
		}

		System.out.println(answer.size());
		Collections.sort(answer);
		for (Integer size : answer) {
			System.out.println(size);
		}
	}

	private static int method(int start, int end, int count) {

		if (map[start][end] == 1 && !visited[start][end]) {
			visited[start][end] = true;
			count++;

			for (int i = 0; i < 4; i++) {
				int nextX = start + dx[i];
				int nextY = end + dy[i];

				if (nextX < 0) {
					continue;
				}
				if (nextY < 0) {
					continue;
				}
				if (nextX >= mapSize) {
					continue;
				}
				if (nextY >= mapSize) {
					continue;
				}

				count = method(nextX, nextY, count);
			}

		}
		return count;
	}

}
