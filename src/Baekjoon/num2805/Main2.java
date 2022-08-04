package Baekjoon.num2805;

/*
	문제    : BOJ 나무 자르기
    유형    : 이분 탐색
	난이도   : HARD (S2)
	시간    : 60m
	uri    : https://www.acmicpc.net/problem/2805
    날짜    : 22.08.04(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		long m = Long.parseLong(st.nextToken());

		st = new StringTokenizer(br.readLine());
		long[] tree = new long[n];

		long max = 0;
		for (int i = 0; i < n; i++) {
			long h = Long.parseLong(st.nextToken());
			tree[i] = h;
			max = Math.max(h, max);
		}

		long start = 0;
		long end = max;

		while (start <= end) {
			long mid = (start + end) / 2;
			long sum = 0;

			for (long t : tree) {
				if (t > mid) {
					sum += t - mid;
				}
			}

			if (sum >= m) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		System.out.println(end);
	}
}
