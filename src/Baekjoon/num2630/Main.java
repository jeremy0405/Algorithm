package Baekjoon.num2630;

/*
	문제    : BOJ 색종이 만들기
    유형    : 재귀
	난이도   : MEDIUM(S3)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/2630
    날짜    : 22.03.25(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] paper;
	static int white;
	static int blue;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		paper = new int[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		parsePaper(0, 0, n);

		System.out.println(white);
		System.out.println(blue);

	}

	private static void parsePaper(int start, int end, int size) {
		if (!checkSameColor(start, end, size)) {
			size = size / 2;
			parsePaper(start, end, size);
			parsePaper(start + size, end, size);
			parsePaper(start, end + size, size);
			parsePaper(start + size, end + size, size);
		}
	}

	private static boolean checkSameColor(int start, int end, int size) {
		int tmp = paper[start][end];
		for (int i = start; i < start + size; i++) {
			for (int j = end; j < end + size; j++) {
				if (paper[i][j] != tmp) {
					return false;
				}
			}
		}
		if (tmp == 0) {
			white++;
		} else {
			blue++;
		}
		return true;
	}

}
