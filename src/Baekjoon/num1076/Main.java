package Baekjoon.num1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		Map<String, List<Integer>> map = new HashMap<>();
		map.put("black", List.of(0, 1));
		map.put("brown", List.of(1, 10));
		map.put("red", List.of(2, 100));
		map.put("orange", List.of(3, 1_000));
		map.put("yellow", List.of(4, 10_000));
		map.put("green", List.of(5, 100_000));
		map.put("blue", List.of(6, 1_000_000));
		map.put("violet", List.of(7, 10_000_000));
		map.put("grey", List.of(8, 100_000_000));
		map.put("white", List.of(9, 1_000_000_000));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a =	map.get(br.readLine()).get(0);
		int b = map.get(br.readLine()).get(0);
		int c = map.get(br.readLine()).get(1);

		long answer = (long) (10 * a + b) * c;

		System.out.println(answer);
		br.close();

	}

}
