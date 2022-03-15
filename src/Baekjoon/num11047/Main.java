package Baekjoon.num11047;

/*
	문제    : BOJ 동전 0
    유형    : 그리디
	난이도   : EASY(S3)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/11047
    날짜    : 22.03.15(o)
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
		int n = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			while (target >= arr[i]) {
				target -= arr[i];
				count++;
			}
		}

		System.out.println(count);
	}

}
