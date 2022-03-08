package Baekjoon.num18870;

/*
	문제    : BOJ 좌표 압축
    유형    : 정렬, 좌표 압축
	난이도   : MEDIUM(S2)
	시간    : 40m
	uri    : https://www.acmicpc.net/problem/18870
    날짜    : 22.03.08(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}


		Set<Integer> set = new TreeSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		Map<Integer, Integer> map = new HashMap<>();
		Iterator<Integer> iterator = set.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			map.put(iterator.next(), i);
			i++;
		}

		StringBuilder sb = new StringBuilder();

		for (int num : arr) {
			sb.append(map.get(num)).append(" ");
		}

		System.out.println(sb);

	}

}
