package Baekjoon.num1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int[] arrays;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arrays = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arrays[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arrays);

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; i++) {
			System.out.println(compare(Integer.parseInt(st.nextToken())));
		}

	}

	public static int compare(int num) {
		int startIdx = 0;
		int endIdx = n - 1;
		int midIdx = 0;

		while (startIdx <= endIdx) {
			midIdx = (startIdx + endIdx) / 2;

			if (num > arrays[midIdx]) {
				startIdx = midIdx + 1;
			} else if (num < arrays[midIdx]) {
				endIdx = midIdx - 1;
			} else {
				return 1;
			}
		}
		return 0;
	}

}
