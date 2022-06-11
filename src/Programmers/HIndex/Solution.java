package Programmers.HIndex;

/*
	문제    : 프로그래머스 H-Index
    유형    : 정렬, 구현
	난이도   : MEDIUM(level 2)
	시간    : 20m
	uri    : https://programmers.co.kr/learn/courses/30/lessons/42747
    날짜    : 22.06.09(o)
    refer  :
*/

import java.util.Arrays;

public class Solution {

	public int solution(int[] citations) {
		Arrays.sort(citations);
		int length = citations.length;

		for (int i = 0; i < length; i++) {
			int h = length - i;
			if (citations[i] >= h) {
				return h;
			}
		}

		return 0;
	}

}
