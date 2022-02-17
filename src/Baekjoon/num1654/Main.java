package Baekjoon.num1654;

/*
	문제    : BOJ 랜선 자르기
    유형    : 이분탐색
	난이도   : HARD (S3)
	시간    : 100m
	uri    : https://www.acmicpc.net/problem/1654
    날짜    : 22.02.17(o)
    refer  : https://dundung.tistory.com/53
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int k = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);

		int[] lan = new int[k];

		for (int i = 0; i < k; i++) {
			lan[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(lan);

		long max = lan[k - 1];
		long min = 1;
		long middle = 0;
		long answer = 0;

		while (max >= min) {
			middle = (max + min) / 2;
			long count = 0;
			for (int i = 0; i < k; i++) {
				count += lan[i] / middle;
			}

			if (count >= n) {
				answer = middle;
				min = middle + 1;
			} else {
				max = middle - 1;
			}

		}

		System.out.println(answer);

	}

}
