package Baekjoon.num1978;

/*
	문제    : BOJ 소수 찾기
    유형    :
	난이도   : Easy
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/1978
    날짜    : 22.02.03(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;

		for (int i = 0; i < num; i++) {
			if(isPrime(Integer.parseInt(st.nextToken()))) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean isPrime(int parseInt) {
		Set<Integer> set = new HashSet<>();

		for (int i = 1; i <= Math.sqrt(parseInt); i++) {
			if (parseInt % i == 0) {
				set.add(i);
				set.add(parseInt / i);
			}
		}

		return set.size() == 2;
	}

}
