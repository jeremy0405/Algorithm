package Baekjoon.num2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		int tmp;

		for (int i = 0; i < input; i++) {
			tmp = i + plus(i);
			if (tmp == input) {
				System.out.println(i);
				break;
			}
		}

		//196 1 9 6

	}

	private static int plus(int i) {
		String a = String.valueOf(i);
		int total = 0;
		for (int j = 0; j < a.length(); j++) {
			total += Integer.parseInt(String.valueOf(a.charAt(j)));
		}
		return total;
	}

}
