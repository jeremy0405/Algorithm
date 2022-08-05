package Baekjoon.num2110;

/*
	문제    : BOJ 공유기 설치
    유형    : 이분 탐색
	난이도   : HARD (G5)
	시간    : 60m
	uri    : https://www.acmicpc.net/problem/2110
    날짜    : 22.08.05(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int c = Integer.parseInt(input[1]);

		int[] home = new int[n];
		for (int i = 0; i < n; i++) {
			home[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(home);

		int start = 1;
		int end = home[n - 1] - home[0];

		while (start <= end) {
			int mid = (start + end) / 2;
			int left = home[0];
			int device = 1;

			for (int i = 1; i < n; i++) {
				if (home[i] - left >= mid) {
					device++;
					left = home[i];
				}
			}

			if (device >= c) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(end);
	}
}
