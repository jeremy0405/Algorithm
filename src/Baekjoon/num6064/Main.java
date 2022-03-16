package Baekjoon.num6064;

/*
	문제    : BOJ 카잉 달력
    유형    : 그리디
	난이도   : EASY(S1)
	시간    : 15m
	uri    : https://www.acmicpc.net/problem/6064
    날짜    : 22.03.16(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		for (int i = 0; i < repeat; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			findAnswer(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
	}

	private static void findAnswer(int m, int n, int x, int y) {
		int i = x % m;
		int j = y % n;

		int answer = i;

		while (i != j) {
			if (i < j) {
				i += m;
			}
			if (j < i) {
				j += n;
			}

			if (i > m * n || j > m * n) {
				answer = -1;
				break;
			}
			answer = i;
		}

		System.out.println(answer);

	}

}
