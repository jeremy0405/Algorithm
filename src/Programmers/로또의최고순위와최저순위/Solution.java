package Programmers.로또의최고순위와최저순위;

/*
	문제    : 프로그래머스 로또의 최고 순위와 최저 순위
    유형    : 구현
	난이도   : EASY (level1)
	시간    : 40m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/77484
    날짜    : 22.08.02(o)
    refer  :
*/

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {

		int count = 0;
		int zero = 0;
		for (int i = 0; i < 6; i++) {
			int number = lottos[i];
			if (number == 0) {
				zero++;
				continue;
			}
			for (int j = 0; j < 6; j++) {
				if (number == win_nums[j]) {
					count++;
					break;
				}
			}
		}

		int max = 7 - count - zero;
		int min = 7 - count;

		if (min > 6) {
			min = 6;
		}

		if (max > 6) {
			max = 6;
		}

		return new int[]{max, min};
	}
}
