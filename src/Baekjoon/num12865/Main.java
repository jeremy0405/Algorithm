package Baekjoon.num12865;

/*
	문제    : BOJ 평범한 배낭
    유형    :
	난이도   : MEDIUM(G5)
	시간    : m
	uri    : https://www.acmicpc.net/problem/12865
    날짜    : 22.05.11(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int k;
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		int[][] wv = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			wv[i][0] = Integer.parseInt(st.nextToken());
			wv[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(wv, Comparator.comparingInt(o -> o[0]));

		for (int i = 0; i < n; i++) {
			dfs(i, 0, 0, wv);
		}

		System.out.println(max);


	}

	private static int dfs(int i, int weight, int value, int[][] wv) {
		weight += wv[i][0];
		if (weight > k) {
			return value;
		}
		value += wv[i][1];

		for (int j = i + 1; j < n; j++) {
			max = Math.max(max, dfs(j, weight, value, wv));
		}

		return value;
	}

	/*
4 7
6 12
4 8
5 12
3 6
	 */

}
