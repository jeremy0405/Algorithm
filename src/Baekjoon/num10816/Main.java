package Baekjoon.num10816;

/*
	문제    : BOJ 숫자 카드 2
    유형    :
	난이도   : Easy
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/10816
    날짜    : 22.02.10(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[20_000_001];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(st.nextToken()) + 10_000_000]++;
		}

		int m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			bw.write(arr[Integer.parseInt(st.nextToken()) + 10_000_000] + " ");
		}

		bw.flush();

		br.close();
		bw.close();
	}

}
