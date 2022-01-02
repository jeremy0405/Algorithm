package Baekjoon.num2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());

		int[] arr = new int[size];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int answer = 0;
		int tmp;

		for (int i = 0; i < size - 2; i++) {
			for (int j = i + 1; j < size - 1; j++) {
				for (int k = j + 1; k < size; k++) {
					tmp = arr[i] + arr[j] + arr[k];
					if (tmp == goal) {
						System.out.println(tmp);
						System.exit(0);
					} else if (tmp < goal) {
						if (tmp > answer) {
							answer = tmp;
						}
					}
				}
			}
		}

		System.out.println(answer);

	}

}