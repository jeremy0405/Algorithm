package Baekjoon.num1620;

/*
	문제    : BOJ 나는야 포켓몬 마스터 이다솜
    유형    : 자료구조
	난이도   : EASY(S4)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/1620
    날짜    : 22.03.03(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Integer> store = new HashMap<>();
		List<String> storeList = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			String tmp = br.readLine();
			store.put(tmp, i);
			storeList.add(tmp);
		}

		for (int i = 0; i < M; i++) {
			String tmp = br.readLine();
			try {
				System.out.println(storeList.get(Integer.parseInt(tmp) - 1));
			} catch (Exception e) {
				System.out.println(store.get(tmp));
			}
		}

	}

}
