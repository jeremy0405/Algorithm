package Baekjoon.num10757;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputA = sc.next();
		String inputB = sc.next();
		BigInteger a = new BigInteger(inputA);
		BigInteger b = new BigInteger(inputB);
		a = a.add(b);
		System.out.println(a.toString());
	}

}
