package Programmers.전력망을둘로나누기;

/*
	문제    : 프로그래머스 전력망을 둘로 나누기
    유형    : bfs
	난이도   : MEDIUM(level2)
	시간    : 60m
	uri    : https://programmers.co.kr/learn/courses/30/lessons/86971
    날짜    : 22.04.29(o)
    refer  :
*/

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	private int[][] connect;

	public int solution(int n, int[][] wires) {
		int answer = 100;

		connect = new int[n + 1][n + 1];

		for (int i = 0; i < wires.length; i++) {
			int start = wires[i][0];
			int end = wires[i][1];

			connect[start][end] = 1;
			connect[end][start] = 1;

		}

		for (int i = 0; i < wires.length; i++) {
			int start = wires[i][0];
			int end = wires[i][1];

			connect[start][end] = 0;
			connect[end][start] = 0;

			int a = calculateSize(start, n);
			int b = calculateSize(end, n);

			System.out.println("끊는 위치:" + start + " " + end);
			System.out.println(a + " " + b);

			answer = Math.min(answer, Math.abs(a - b));

			connect[start][end] = 1;
			connect[end][start] = 1;
		}

		return answer;
	}

	public int calculateSize(int top, int n) {
		boolean[] visited = new boolean[n + 1];
		int count = 1;

		Queue<Integer> q = new LinkedList<>();
		q.offer(top);
		visited[top] = true;

		while (!q.isEmpty()) {
			int tmp = q.poll();

			for (int i = 0; i <= n; i++) {
				if (visited[i]) {
					continue;
				}
				if (connect[tmp][i] == 1) {
					q.offer(i);
					visited[i] = true;
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
//		int solution = s.solution(9,	new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}});
//		int solution = s.solution(4,	new int[][]{{1, 2}, {2, 3}, {3, 4}});
		int solution = s.solution(7,	new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}});

		System.out.println(solution);
	}

}
