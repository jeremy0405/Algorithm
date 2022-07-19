package Baekjoon.num1026;

/*
	문제    : BOJ 보물
    유형    : 정렬
	난이도   : EASY(S4)
	시간    : 10m
	uri    : https://www.acmicpc.net/problem/1026
    날짜    : 22.07.20(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> arr1 = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr1.add(Integer.valueOf(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr2.add(Integer.valueOf(st.nextToken()));
		}

		Collections.sort(arr1);
		Collections.sort(arr2, Comparator.reverseOrder());

		int answer = 0;
		for (int i = 0; i < arr1.size(); i++) {
			answer += arr1.get(i) * arr2.get(i);
		}

		System.out.println(answer);
	}

}
