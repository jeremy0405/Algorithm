package Baekjoon.num18111;

/*
	문제    : BOJ 마인크래프트
    유형    : 브루트포스
	난이도   : MEDIUM (S2)
	시간    : 20m
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

		int time = Integer.MAX_VALUE;
		int height = 0;

		for (int i = min; i <= max; i++) {
			int bag = block;
			int tmpTime = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (i - ground[j][k] < 0) {
						bag += (i - ground[j][k]);
						tmpTime -= (i - ground[j][k]) * 2;
					} else {
						bag += (i - ground[j][k]);
						tmpTime += (i - ground[j][k]);
					}
				}
			}
			if (bag >= 0) {
				if (tmpTime <= time) {
					time = tmpTime;
					height = i;
				}
			}

		}

		System.out.println(time + " " + height);

	}

}
