package Baekjoon.num1992;

/*
	문제    : BOJ 쿼드트리
    유형    : 재귀
	난이도   : EASY(S1)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/1992
    날짜    : 22.07.03(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static int[][] img;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		img = new int[N][N];

		for(int i = 0; i < N; i++) {
			String line = br.readLine();

			for(int j = 0; j < N; j++) {
				img[i][j] = line.charAt(j) - '0';
			}
		}

		compressImg(0, 0, N);
		System.out.println(sb);
	}

	public static void compressImg(int x, int y, int size) {

		if(canCompress(x, y, size)) {
			sb.append(img[x][y]);
			return;
		}

		int newSize = size / 2;

		sb.append('(');

		compressImg(x, y, newSize);						        // 왼쪽 위
		compressImg(x, y + newSize, newSize);				// 오른쪽 위
		compressImg(x + newSize, y, newSize);				// 왼쪽 아래
		compressImg(x + newSize, y + newSize, newSize);	// 오른쪽 아래

		sb.append(')');


	}

	public static boolean canCompress(int x, int y, int size) {
		int value = img[x][y];

		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(value != img[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
