package Baekjoon.num2869;

/*
	문제    : BOJ 달팽이는 올라가고 싶다
    유형    :
	난이도   : Easy (B1)
	시간    : 5m
	uri    : https://www.acmicpc.net/problem/2869
    날짜    : 22.02.03(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int tmp = 0;
		int count = 0;
		while (tmp < c) {
			count++;
			tmp += a;
			if (tmp >= c) {
				break;
			}
			tmp -= b;
		}

		System.out.println(count);
	}

}
