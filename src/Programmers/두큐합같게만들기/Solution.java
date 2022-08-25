package Programmers.두큐합같게만들기;

/*
	문제    : 두 큐 합 같게 만들기
    유형    : 큐, 구현
	난이도   : EASY (level 2)
	시간    : 10m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/118667
    날짜    : 22.08.26(o)
    refer  :
*/

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public int solution(int[] queue1, int[] queue2) {
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();

		long sum1 = 0;
		long sum2 = 0;

		for (int value : queue1) {
			q1.offer(value);
			sum1 += value;
		}

		for (int value : queue2) {
			q2.offer(value);
			sum2 += value;
		}

		int answer = 0;
		while (sum1 != sum2) {
			if (answer >= (queue1.length + 1) * 2) {
				answer = -1;
				break;
			}
			if (sum1 > sum2) {
				int value = q1.poll();
				q2.offer(value);
				sum1 -= value;
				sum2 += value;
			} else {
				int value = q2.poll();
				q1.offer(value);
				sum2 -= value;
				sum1 += value;
			}
			answer++;
		}

		return answer;
	}
}
