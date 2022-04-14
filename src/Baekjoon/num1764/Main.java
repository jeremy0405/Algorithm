package Baekjoon.num1764;

/*
	문제    : BOJ 듣보잡
    유형    :
	난이도   : EASY(S4)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/1764
    날짜    : 22.04.14(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);

		List<String> store = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			store.add(br.readLine());
		}

		List<String> answer = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			if (store.contains(name)) {
				answer.add(name);
			}
		}

		Collections.sort(answer);

		System.out.println(answer.size());
		for (String name : answer) {
			System.out.println(name);
		}

	}

}
