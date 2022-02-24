package Baekjoon.num2805;

/*
	문제    : BOJ 나무 자르기
    유형    : 이분 탐색
	난이도   : MEDIUM (S3)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/2805
    날짜    : 22.02.25(o)
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

		int N = Integer.parseInt(st.nextToken());
		long M = Long.parseLong(st.nextToken());

		long[] tree = new long[N];
		st = new StringTokenizer(br.readLine());
		long max = 0L;
		long min = 0L;
		for (int i = 0; i < N; i++) {
			long tmp = Long.parseLong(st.nextToken());
			tree[i] = tmp;
			max = Math.max(max, tmp);
		}

		long answer = 0;
		while (max >= min) {
			long medium = (max + min) / 2;
			long total = 0;
			for (int i = 0; i < N; i++) {
				if (tree[i] - medium > 0) {
					total += tree[i] - medium;
				}
			}

			if (M == total) {
				answer = medium;
				break;
			} else if (M > total) {
				max = medium - 1;
				answer = (max + min) / 2;
			} else {
				min = medium + 1;
				answer = (max + min) / 2;
			}
		}

		System.out.println(answer);
	}


}
