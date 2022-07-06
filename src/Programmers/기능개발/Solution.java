package Programmers.기능개발;

/*
	문제    : 기능개발
    유형    : 스택/큐
	난이도   : MEDIUM (level 2)
	시간    : 60m
	uri    : https://programmers.co.kr/learn/courses/30/lessons/42586
    날짜    : 22.07.06(o)
    refer  :
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public int[] solution(int[] progresses, int[] speeds) {
		List<Integer> answer = new ArrayList<>();

		int length = progresses.length;
		int[] end = new int[length];

		for (int i = 0; i < length; i++) {
			int day = 0;
			while (progresses[i] < 100) {
				progresses[i] += speeds[i];
				day++;
			}
			end[i] = day;
		}

		int before = end[0];
		int count = 0;
		for (int i = 1; i < length; i++) {
			count++;
			if (end[i] > before) {
				answer.add(count);
				count = 0;
				before = end[i];
			}
		}

		answer.add(++count);

		return answer.stream().mapToInt(i -> i).toArray();
	}

}
