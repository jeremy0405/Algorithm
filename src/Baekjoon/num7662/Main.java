package Baekjoon.num7662;

/*
	문제    : BOJ 이중 우선순위 큐
    유형    : TreeMap, 구현
	난이도   : MEDIUM(G4)
	시간    : 60m
	uri    : https://www.acmicpc.net/problem/7662
    날짜    : 22.08.17(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		TreeMap<Integer, Integer> map;

		for (int i = 0; i < testCase; i++) {
			 map = new TreeMap<>();
			int n = Integer.parseInt(br.readLine());

			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String command = st.nextToken();
				int arg = Integer.parseInt(st.nextToken());

				if (command.equals("I")) {
					map.put(arg, map.getOrDefault(arg, 0) + 1);
				} else {
					if (map.size() == 0) {
						continue;
					}
					int tmp;
					if (arg == 1) {
						tmp = map.lastKey();
					} else {
						tmp = map.firstKey();
					}
					if (map.get(tmp) == 1) {
						map.remove(tmp);
					} else {
						map.put(tmp, map.get(tmp) - 1);
					}
				}
			}
			if (map.isEmpty()) {
				System.out.println("EMPTY");
			} else {
				System.out.println(map.lastKey() + " " + map.firstKey());
			}

		}

	}

}
