package Programmers.배달;

/*
	문제    : 프로그래머스 배달
    유형    : 다익스트라
	난이도   : MEDIUM (level2)
	시간    : 60m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/12978
    날짜    : 22.09.01(o)
    refer  :
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution {

	static class Town implements Comparable<Town> {

		int num;
		int time;

		public Town(int num, int time) {
			this.num = num;
			this.time = time;
		}

		@Override
		public int compareTo(Town o) {
			return this.time - o.time;
		}
	}

	List<List<Town>> map;
	int[] answer;

	public int solution(int N, int[][] road, int K) {

		map = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			map.add(new ArrayList<>());
		}

		answer = new int[N + 1];

		for (int[] info : road) {
			map.get(info[0]).add(new Town(info[1], info[2]));
			map.get(info[1]).add(new Town(info[0], info[2]));
		}

		dijkstra(N);

		int count = 0;
		for (int time : answer) {
			if (time <= K) {
				count++;
			}
		}

		return count;
	}

	private void dijkstra(int N) {
		Arrays.fill(answer, 987654321);
		PriorityQueue<Town> pq = new PriorityQueue<>();
		pq.offer(new Town(1, 0));
		answer[1] = 0;

		while (!pq.isEmpty()) {
			Town now = pq.poll();

			for (Town town : map.get(now.num)) {
				if (answer[town.num] > answer[now.num] + town.time) {
					answer[town.num] = answer[now.num] + town.time;
					pq.offer(new Town(town.num, answer[town.num]));
				}
			}
		}
	}
}
