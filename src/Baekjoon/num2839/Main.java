package Baekjoon.num2839;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num == 4 || num == 7) {
			System.out.println(-1);
			System.exit(0);
		}

		switch (num % 15) {
			case 0:
			case 5:
			case 10:
				System.out.println(num / 5);
				break;
			case 1:
			case 6:
			case 11:
				System.out.println((num - (3 * 2)) / 5 + 2);
				break;
			case 2:
			case 7:
			case 12:
				System.out.println((num - (3 * 4)) / 5 + 4);
				break;
			case 3:
			case 8:
			case 13:
				System.out.println((num - (3 * 1)) / 5 + 1);
				break;
			case 4:
			case 9:
			case 14:
				System.out.println((num - (3 * 3)) / 5 + 3);
				break;
		}

	}

}
