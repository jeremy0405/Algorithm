package Baekjoon.num11399;

/*
	문제    : BOJ ATM
    유형    : 그리디 알고리즘
	난이도   : EASY(S3)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/11399
    날짜    : 22.03.01(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int total = 0;
		int[] totalArr = new int[N];
		for (int i = 0; i < N; i++) {
			total += arr[i];
			totalArr[i] = total;
		}

		System.out.println(Arrays.stream(totalArr).sum());

	}

}
