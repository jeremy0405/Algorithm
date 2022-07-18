package Baekjoon.num2529;

/*
	문제    : BOJ 부등호
    유형    : 백트래킹
	난이도   : MEDIUM(S2)
	시간    : 20m
	uri    : https://www.acmicpc.net/problem/2529
    날짜    : 22.07.19(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	static List<int[]> combi = new ArrayList<>();
	static int[] arr;
	static boolean[] visited;
	static String[] cond;
	static StringBuilder sb = new StringBuilder();


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		arr = new int[k + 1];
		visited = new boolean[10];
		cond = br.readLine().split(" ");

		dfs(0, k + 1);

		checkAnswerFromEnd();
		checkAnswerFromStart();

		System.out.println(sb);
	}

	private static void checkAnswerFromEnd() {
		for (int j = combi.size() -1; j >= 0; j--) {
			int[] arr = combi.get(j);
			boolean flag = false;
			for (int i = 0; i < cond.length; i++) {
				if (cond[i].equals(">")) {
					if (arr[i] < arr[i + 1]) {
						flag = true;
						break;
					}
				} else {
					if (arr[i] > arr[i + 1]) {
						flag = true;
						break;
					}
				}
			}
			if (!flag) {
				for (int i : arr) {
					sb.append(i);
				}
				sb.append('\n');
				return;
			}
		}
	}

	private static void checkAnswerFromStart() {

		for (int[] arr : combi) {
			boolean flag = false;
			for (int i = 0; i < cond.length; i++) {
				if (cond[i].equals(">")) {
					if (arr[i] < arr[i + 1]) {
						flag = true;
						break;
					}
				} else {
					if (arr[i] > arr[i + 1]) {
						flag = true;
						break;
					}
				}
			}
			if (!flag) {
				for (int i : arr) {
					sb.append(i);
				}
				sb.append('\n');
				return;
			}
		}


	}

	private static void dfs(int depth, int n) {
		if (depth == n) {
			int[] tmp = Arrays.copyOf(arr, arr.length);
			combi.add(tmp);
			return;
		}

		for (int i = 0; i <10; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1, n);
				visited[i] = false;
			}
		}
	}

}
