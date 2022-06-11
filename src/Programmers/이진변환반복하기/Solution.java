package Programmers.이진변환반복하기;

/*
	문제    : 프로그래머스 이진 변환 반복하기
    유형    : 구현
	난이도   : EASY (level 2)
	시간    : 20m
	uri    : https://programmers.co.kr/learn/courses/30/lessons/70129
    날짜    : 22.06.11(o)
    refer  :
*/

public class Solution {

	public int[] solution(String s) {
		int numberOfRemovedZero = 0;
		int repeat = 0;

		if (s.length() == 1) {
			return new int[] {1, 0};
		}

		while (s.length() >= 1) {
			int numberOfZero = countZero(s);
			numberOfRemovedZero += numberOfZero;
			s = convertToBinary(s.length() - numberOfZero);
			System.out.println(s);
			repeat++;
		}

		return new int[] {repeat, numberOfRemovedZero};
	}

	private String convertToBinary(int number) {
		StringBuilder sb = new StringBuilder();

		while (number >= 1) {
			if (number % 2 == 1) {
				sb.append('1');
			} else {
				sb.append('0');
			}
			number /= 2;
		}
		return sb.reverse().toString();
	}

	private int countZero(String input) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0') {
				count++;
			}
		}
		return count;
	}

}
