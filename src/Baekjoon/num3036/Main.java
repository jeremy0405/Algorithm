package Baekjoon.num3036;

/*
	문제    : BOJ 링
    유형    :
	난이도   : EASY(S3)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/3036
    날짜    : 22.04.22(o)
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

		StringTokenizer st = new StringTokenizer(br.readLine());
		int first = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < repeat; i++) {
			int other = Integer.parseInt(st.nextToken());
			int firstTemp = first;
			int secondTemp = other;

			while (secondTemp != 0) {
				int remain = firstTemp % secondTemp;
				firstTemp = secondTemp;
				secondTemp = remain;
			}

			sb.append(first / firstTemp).append("/").append(other / firstTemp).append(System.lineSeparator());

		}

		System.out.println(sb);

	}

}
