package Baekjoon.num1052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int tmp = countOneInBinary(n);
		int bottle = 0;
		while(tmp > k) {
			bottle++;
			tmp = countOneInBinary(n + bottle);
		}
		System.out.println(bottle);
	}

	public static int countOneInBinary(int n) {
		int count = 0;
		while (n != 0) {
			if(n % 2 == 1) {
				count++;
			}
			n >>>= 1;
		}
		return count;
	}

}
