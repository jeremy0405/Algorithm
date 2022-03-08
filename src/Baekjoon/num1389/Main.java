package Baekjoon.num1389;

/*
	문제    : BOJ 케빈 베이컨의 6단계 법칙
    유형    : 플로이드 와샬
	난이도   : MEDIUM(S1)
	시간    : 60m
	uri    : https://www.acmicpc.net/problem/1389
    날짜    : 22.03.09(o)
    refer  : https://steady-coding.tistory.com/95
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int userNum = Integer.parseInt(st.nextToken());
		int relation = Integer.parseInt(st.nextToken());

		int[][] arr = new int[userNum + 1][userNum + 1];

		int INF = Integer.MAX_VALUE / 2;

		for (int i = 1; i <= userNum; i++) {
			for (int j = 1; j <= userNum; j++) {
				if (i == j) {
					arr[i][j] = 0;
					continue;
				}
				arr[i][j] = INF;
			}
		}

		for (int i = 0; i < relation; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			arr[first][second] = 1;
			arr[second][first] = 1;
		}

		for (int i = 1; i <= userNum; i++) {
			for (int j = 1; j <= userNum; j++) {
				for (int k = 1; k <= userNum; k++) {
					if (arr[i][j] > arr[i][k] + arr[k][j]) {
						arr[i][j] = arr[i][k] + arr[k][j];
					}
				}
			}
		}

		int min = Integer.MAX_VALUE;
		int idx = -1;

		for (int i = 1; i <= userNum; i++) {
			int total = 0;
			for (int j = 1; j < userNum; j++) {
				total += arr[i][j];
			}
			if (min > total) {
				min = total;
				idx = i;
			}
		}

		System.out.println(idx);

	}

}
