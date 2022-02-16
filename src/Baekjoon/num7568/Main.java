package Baekjoon.num7568;

/*
	문제    : BOJ 덩치
    유형    : 구현, 브루트포스
	난이도   : HARD (S5)
	시간    : 45m
	uri    : https://www.acmicpc.net/problem/7568
    날짜    : 22.02.16(x)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][4];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = i + 1;
		}

		for (int j = 0; j < n - 1; j++) {
			for (int i = 0; i < n - 1; i++) {
				if (arr[i][0] < arr[i + 1][0] && arr[i][1] < arr[i + 1][1]) {
					int[] tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
		}

		int num = 1;
		int tmp = 1;
		arr[0][3] = 1;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i][0] > arr[i + 1][0] && arr[i][1] > arr[i + 1][1]) {
				arr[i][3] = num;
				num += tmp;
				arr[i + 1][3] = num - 1;
			} else {
				arr[i][3] = num;
			}
			tmp++;
		}

		int k = 1;
		for (int j = 0; j < n; j++) {
			for (int i = 1; i <= n; i++) {
				if (arr[i - 1][2] == k) {
					System.out.print(arr[i - 1][3] + " ");
					k++;
				}
			}
		}



	}

}
