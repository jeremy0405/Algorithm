package Baekjoon.num9205;

/*
	문제    : BOJ 맥주 마시면서 걸어가기
    유형    : bfs
	난이도   : MEDIUM(S1)
	시간    : 45m
	uri    : https://www.acmicpc.net/problem/9205
    날짜    : 22.07.15(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());

		for (int i = 0; i < repeat; i++) {
			int countOfStore = Integer.parseInt(br.readLine());
			int[][] storeLocation = new int[countOfStore + 2][2];
			boolean[][] connect = new boolean[countOfStore + 2][countOfStore + 2];
			boolean[] visited = new boolean[countOfStore + 2];

			String[] home = br.readLine().split(" ");
			storeLocation[0][0] = Integer.parseInt(home[0]);
			storeLocation[0][1] = Integer.parseInt(home[1]);

			for (int j = 1; j <= countOfStore; j++) {
				String[] store = br.readLine().split(" ");
				storeLocation[j][0] = Integer.parseInt(store[0]);
				storeLocation[j][1] = Integer.parseInt(store[1]);
			}

			String[] festival = br.readLine().split(" ");
			storeLocation[countOfStore + 1][0] = Integer.parseInt(festival[0]);
			storeLocation[countOfStore + 1][1] = Integer.parseInt(festival[1]);

			for (int j = 0; j < countOfStore + 2; j++) {
				for (int k = 0; k < countOfStore + 2; k++) {
					if (j == k) {
						continue;
					}
					if (Math.abs(storeLocation[j][0] - storeLocation[k][0]) +
						Math.abs(storeLocation[j][1] - storeLocation[k][1]) <= 1000) {

						connect[j][k] = true;
						connect[k][j] = true;
					}
				}
			}

			Queue<Integer> q = new LinkedList<>();
			q.offer(0);
			visited[0] = true;

			while (!q.isEmpty()) {
				int index = q.poll();

				for (int j = 0; j < countOfStore + 2; j++) {
					if (connect[index][j] && !visited[j]) {
						q.offer(j);
						visited[j] = true;
					}
				}
			}

			if (visited[countOfStore + 1]) {
				System.out.println("happy");
			} else {
				System.out.println("sad");
			}

		}

	}

}
