package Baekjoon.num1439;

/*
	문제    : BOJ 문자열 뒤집기
    유형    : 그리디
	난이도   : EASY(S5)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/1439
    날짜    : 22.03.14(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] split0 = s.split("0");
		String[] split1 = s.split("1");

		long count0 = Arrays.stream(split0).filter(a -> !a.isBlank()).count();
		long count1 = Arrays.stream(split1).filter(a -> !a.isBlank()).count();

		System.out.println(Math.min(count0, count1));

	}

}
