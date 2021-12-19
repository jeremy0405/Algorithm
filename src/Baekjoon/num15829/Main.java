package Baekjoon.num15829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		double hash = 0;
		double pow = 1;
		int aa = 'a' - 1;

		for (int i = 0; i < total; i++) {
			if (pow == 1) {
				hash += (br.read() - aa) * pow;
				pow *= 31;
				continue;
			}
			hash += (br.read() - aa) * pow;
			pow = (pow * 31) % 1234567891;

			if (hash > 1234567891) {
				hash = hash % 1234567891;
			}
		}
		System.out.printf("%.0f", hash);
	}

}
