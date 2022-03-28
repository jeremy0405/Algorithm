package Baekjoon.num7576;

/*
	문제    : BOJ 토마토
    유형    :
	난이도   : MEDIUM(G1)
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/7576
    날짜    : 22.03.29(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		//todo
		// queue를 가지고 있는거지?
		// 1인 좌표들만 queue에 넣어
		// 꺼내면서 상 하 좌 우가 0 이라면 1로 변경하는거지?
		// 이전에 queue에 넣었던 사이즈와 현재의 사이즈가 같다면? -> 변경이 이루어지지 않았다는 것 -> -1 출력
		// queue의 사이즈가 -1을 제외한 n * m과 같다면? -> 시간을 출력하면 되겠지

		Queue<int[]> q = new LinkedList<>();
		int time = 0;
		int targetSize = n * m;

		int[][] box = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				box[i][j] = tmp;
				if (tmp == -1) {
					targetSize--;
				} else if (tmp == 1) {
					q.add(new int[]{i, j});
				}
			}
		}

		if (q.size() == targetSize) {
			System.out.println(time);
			return;
		}

		while (true) {
			int beforeSize = q.size();

			while (!q.isEmpty()) {
				int[] xy = q.poll();
				int x = xy[0];
				int y = xy[1];

				if (x != n - 1) {
					if (box[x + 1][y] != -1) {
						box[x + 1][y] = 1;
					}
				}
				if (x != 0) {
					if (box[x - 1][y] != -1) {
						box[x - 1][y] = 1;
					}
				}
				if (y != m - 1) {
					if (box[x][y + 1] != -1) {
						box[x][y + 1] = 1;
					}
				}
				if (y != 0) {
					if (box[x][y - 1] != -1) {
						box[x][y - 1] = 1;
					}
				}

			}

			time++;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (box[i][j] == 1) {
						q.add(new int[]{i, j});
					}
				}
			}

			if (q.size() == targetSize) {
				System.out.println(time);
				return;
			}

			if (q.size() == beforeSize) {
				System.out.println(-1);
				return;
			}
		}

	}

}
