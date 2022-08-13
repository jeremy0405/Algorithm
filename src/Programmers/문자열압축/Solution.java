package Programmers.문자열압축;

/*
	문제    : 문자열 압축
    유형    : 구현
	난이도   : HARD (level 2)
	시간    : 60m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/60057
    날짜    : 22.08.12(o)
    refer  :
*/

public class Solution {

	public int solution(String s) {
		int answer = 1000;

		for (int step = 1; step <= s.length() / 2; step++) {
			StringBuilder sb = new StringBuilder();
			String prev = s.substring(0, step);
			int count = 1;
			for (int i = step; i < s.length(); i += step) {
				String sub = "";
				for (int j = i; j < i + step; j++) {
					if (j < s.length()) {
						sub += s.charAt(j);
					}
				}
				if (prev.equals(sub)) {
					count++;
				 } else {
					if (count >= 2) {
						sb.append(count).append(prev);
					} else {
						sb.append(prev);
					}
					sub = "";
					for (int j = i; j < i + step; j++) {
						if (j < s.length()) {
							sub += s.charAt(j);
						}
					}
					prev = sub;
					System.out.println("prev = " + prev);
					count = 1;
				}
			}
			if (count >= 2) {
				sb.append(count).append(prev);
			} else {
				sb.append(prev);
			}
			System.out.println(sb);
			answer = Math.min(sb.length(), answer);
		}


		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("aabbaccc"));
		System.out.println(s.solution("ababcdcdababcdcd"));
		System.out.println(s.solution("abcabcdede"));
		System.out.println(s.solution("abcabcabcabcdededededede"));
		System.out.println(s.solution("xababcdcdababcdcd"));
	}
}
