package Baekjoon.num9375;

/*
	문제    : BOJ 패션왕 신해빈
    유형    :
	난이도   : EASY(S3)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/9375
    날짜    : 22.03.18(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			Map<String, Integer> map = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				String item = br.readLine().split(" ")[1];
				map.put(item, map.getOrDefault(item, 0) + 1);
			}
			Collection<Integer> values = map.values();

			int answer = 1;

			for (Integer value : values) {
				answer *= value + 1;
			}
			System.out.println(answer - 1);
		}

	}

}
