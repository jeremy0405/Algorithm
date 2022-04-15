package Baekjoon.num1316;

/*
	문제    : BOJ 그룹 단어 체커
    유형    : 구현
	난이도   : EASY(S5)
	시간    : 15m
	uri    : https://www.acmicpc.net/problem/1316
    날짜    : 22.04.16(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (valid(br.readLine())) {
				count++;
			}
		}

		System.out.println(count);

	}

	private static boolean valid(String s) {

		char before = '0';
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			if (before != s.charAt(i)) {
				if (!set.add(s.charAt(i))) {
					return false;
				}
				before = s.charAt(i);
			}
		}
		return true;
	}

}
