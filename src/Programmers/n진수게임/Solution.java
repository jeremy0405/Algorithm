package Programmers.n진수게임;

/*
	문제    : [3차] n진수 게임
    유형    : 구현
	난이도   : MEDIUM (level 2)
	시간    : 30m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/17687
    날짜    : 22.09.16(o)
    refer  :
*/

class Solution {
	public String solution(int n, int t, int m, int p) {
		StringBuilder sequence = new StringBuilder();
		StringBuilder answer = new StringBuilder();

		for(int i = 0; sequence.length() <= t * m; i++){
			sequence.append(Integer.toString(i, n));
		}

		for(int i = p - 1; i < t * m; i += m){
			answer.append(sequence.charAt(i));
		}

		return answer.toString().toUpperCase();
	}
}
