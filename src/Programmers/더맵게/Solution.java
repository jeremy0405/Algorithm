package Programmers.더맵게;

/*
	문제    : 더 맵게
    유형    : 큐
	난이도   : MEDIUM (level 2)
	시간    : 40m
	uri    : https://programmers.co.kr/learn/courses/30/lessons/42626
    날짜    : 22.06.04(o)
    refer  :
*/

import java.util.PriorityQueue;

public class Solution {

	public int solution(int[] scoville, int K) {
		int count = 0;

		PriorityQueue<Integer> q = new PriorityQueue<>();

		for (int i = 0; i < scoville.length; i++) {
			q.add(scoville[i]);
		}

		while (q.peek() < K) {
			if (q.size() == 1) {
				return -1;
			}
			q.add(q.poll() + q.poll() * 2);
			count++;
		}

		return count;
	}

}
