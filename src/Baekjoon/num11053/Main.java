package Baekjoon.num11053;

/*
	문제    : BOJ 가장 긴 증가하는 부분 수열
    유형    : dp
	난이도   : MEDIUM(S2)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/11053
    날짜    : 22.07.05(o)
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

		int[] nums = new int[N];
		int[] dp = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
					//초기값부터 자신보다 작은 수를 카운트
					//카운트하면서 자신보다 작지만 dp값이 작은 경우(새로운 증가하는 수열인 경우) 무시
					//비효율적인 풀이라는 생각이 듬
					dp[i] = dp[j] + 1;
				}
			}
		}

		int result = Arrays.stream(dp).max().getAsInt() + 1;
		System.out.println(result);

	}

}
