package Programmers.프린터;

/*
	문제    : 프로그래머스 프린터
    유형    : 구현
	난이도   : EASY (level 2)
	시간    : 30m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/42587
    날짜    : 22.08.19(o)
    refer  :
*/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	static class Task {
		int index;
		int priority;

		public Task(int index, int priority) {
			this.index = index;
			this.priority = priority;
		}
	}

	public int solution(int[] priorities, int location) {
		Queue<Task> queue = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) {
			queue.add(new Task(i, priorities[i]));
		}

		Arrays.sort(priorities);

		int answer = 0;
		for (int i = priorities.length - 1; i >= 0; i--) {
			int maxPriority = priorities[i];
			answer++;
			while (true) {
				if (queue.peek().priority == maxPriority) {
					Task task = queue.poll();
					if (task.index == location) {
						return answer;
					}
					break;
				} else {
					Task task = queue.poll();
					queue.add(task);
				}
			}
		}

		return answer;
	}

}
