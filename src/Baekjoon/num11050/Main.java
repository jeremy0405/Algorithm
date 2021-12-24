package Baekjoon.num11050;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		int N = Integer.parseInt(nums[0]);
		int K = Integer.parseInt(nums[1]);

		int total = factorial(N) / (factorial(K) * factorial(N - K));

		System.out.println(total);

	}

	public static int factorial(int num) {
		int total = 1;
		if (num == 1 || num == 0) {
			return 1;
		}
		for (int i = 1; i <= num; i++) {
			total *= i;
		}
		return total;
	}

}
