package Baekjoon.num15663;

/*
	문제    : BOJ N과 M (9)
    유형    : 백트래킹
	난이도   : MEDIUM(S2)
	시간    : 30m
	uri    : https://www.acmicpc.net/problem/15663
    날짜    : 22.07.08(o)
    refer  :
*/

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int N;
	static int M;
	static int[] nums;
	static int[] perm;
	static boolean[] visited;
	static Set<String> answer = new LinkedHashSet<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		nums = new int[N];
		perm = new int[M];
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		Arrays.sort(nums);
		permutation(0);
		answer.forEach(System.out::println);
	}

	static void permutation(int cnt) {
		if (cnt == M) {
			StringBuilder sb = new StringBuilder();
			for (int p : perm) {
				sb.append(p).append(' ');
			}
			answer.add(sb.toString());
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visited[i])
				continue;
			visited[i] = true;
			perm[cnt] = nums[i];
			permutation(cnt + 1);
			visited[i] = false;
		}
	}
}
