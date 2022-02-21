package Baekjoon.num18111;

/*
	문제    : BOJ 마인크래프트
    유형    : 브루트포스
	난이도   : MEDIUM (S2)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/18111
    날짜    : 22.02.22(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int block = Integer.parseInt(st.nextToken());

		int[][] ground = new int[n][m];

		int max = 0;
		int min = 64000000;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				ground[i][j] = tmp;
				max = Math.max(max, tmp);
				min = Math.min(min, tmp);
			}
		}

		int ansS = Integer.MAX_VALUE;
		int ansH = -1;
		for (int k = min; k <= max; k++) {
			int time = 0;
			int bag = block;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int dif = ground[i][j] - k;

					if (dif > 0) {
						time += Math.abs(dif) * 2;
						bag += Math.abs(dif);
					} else if (dif < 0) {
						time += Math.abs(dif);
						bag -= Math.abs(dif);
					}

				}
			}
			if (bag < 0)
				continue;
			if (ansS >= time) {
				ansS = time;
				ansH = k;
			}
		}

		System.out.println(ansS + " " + ansH);
	}
}
