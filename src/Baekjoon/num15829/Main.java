package Baekjoon.num15829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int hash = 0;

		for (int i = 0; i < total; i++) {
			int a = (br.read());
			hash += (a - 'a' + 1);
		}

			 int b = 0;

	}

}
