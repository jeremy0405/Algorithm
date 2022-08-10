package Baekjoon.num2437;

/*
	문제    : BOJ 저울
    유형    : 그리디
	난이도   : HARD (G3)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/2437
    날짜    : 22.08.10(o)
    refer  : 동빈북 314p, 509p
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int money = 1;
		for (int i : arr) {
			if (i > money) {
				break;
			}
			money += i;
		}

		System.out.println(money);
	}

}
