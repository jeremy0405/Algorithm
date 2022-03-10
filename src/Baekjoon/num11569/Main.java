package Baekjoon.num11569;

/*
	문제    : BOJ 구간 합 구하기 4
    유형    : 누적 합
	난이도   : EASY(S3)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/11569
    날짜    : 22.03.10(o)
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
		int totalNum = Integer.parseInt(st.nextToken());
		int repeat = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] answer = new int[totalNum];

		int total = 0;
		for (int i = 0; i < totalNum; i++) {
			total += Integer.parseInt(st.nextToken());
			answer[i] = total;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < repeat; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			if (start == 1) {
				sb.append(answer[end - 1]).append(System.lineSeparator());
				continue;
			}
			sb.append(answer[end - 1] - answer[start - 2]).append(System.lineSeparator());
		}

		System.out.println(sb);

	}

}
