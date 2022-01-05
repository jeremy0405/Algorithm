package Baekjoon.num1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int tmp = a % 10;
			for (int j = 1; j < b; j++) {
				tmp = tmp * a % 10;
			}

			if(tmp == 0) {
				sb.append(10).append("\n");
				continue;
			}

			sb.append(tmp).append("\n");

		}

		System.out.println(sb);
		br.close();

	}

}

