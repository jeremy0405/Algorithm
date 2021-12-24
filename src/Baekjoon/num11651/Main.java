package Baekjoon.num11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] numArray = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			numArray[i][0] = Integer.parseInt(st.nextToken());
			numArray[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(numArray, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(numArray[i][0] + " " + numArray[i][1] + "\n");
		}

		System.out.println(sb.toString());

	}

}
