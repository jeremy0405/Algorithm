package Baekjoon.num2108;

/*
	문제    : BOJ 통계학
    유형    :
	난이도   : Easy
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/2108
    날짜    : 22.02.09(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[8001];
		int[] arr1 = new int[n];

		int total = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			total += tmp;
			arr[tmp + 4000]++;
			max = Math.max(max, arr[tmp + 4000]);
			arr1[i] = tmp;
		}

		bw.write(Math.round((double) total / n) + "\n");

		Arrays.sort(arr1);
		bw.write(arr1[n / 2] + "\n");

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 8001; i++) {
			if (arr[i] == max) {
				list.add(i - 4000);
			}
		}

		if (list.size() == 1) {
			bw.write(list.get(0) + "\n");
		} else {
			Collections.sort(list);
			bw.write(list.get(1) + "\n");
		}

		bw.write(arr1[n - 1] - arr1[0] + "\n");

		bw.flush();

		br.close();
		bw.close();
	}

}
