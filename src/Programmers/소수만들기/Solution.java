package Programmers.소수만들기;

/*
	문제    : 프로그래머스 소수 만들기
    유형    : 소수
	난이도   : EASY (level 1)
	시간    : 15m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/12977
    날짜    : 22.08.02(o)
    refer  :
*/

class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		boolean[] isNotPrime = new boolean[3001];

		for (int i = 2; i <= 60; i++) {
			if (!isNotPrime[i]) {
				for (int j = i * 2; j <= 3000; j += i) {
					isNotPrime[j] = true;
				}
			}
		}

		//isNotPrime[더한 값] -> false면 카운트 증가
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (!isNotPrime[sum]) {
						answer++;
					}
				}
			}
		}

		return answer;
	}
}
