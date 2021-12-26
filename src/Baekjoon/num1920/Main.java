package Baekjoon.num1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arrays = new int[100001];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arrays[Integer.parseInt(st.nextToken())]++;
		}

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; i++) {
			if(arrays[Integer.parseInt(st.nextToken())] != 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}

}
