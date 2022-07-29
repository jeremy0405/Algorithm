package Programmers.큰수만들기;

/*
	문제    : 프로그래머스 큰 수 만들기
    유형    : 그리디
	난이도   : MEDIUM(level 2)
	시간    : 40m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/42883
    날짜    : 22.07.29(o)
    refer  :
*/

class Solution {
	public String solution(String number, int k) {
		//k + 1 만큼 탐색
		// 최대값 전까지 없앰
		// 최대값이 현재 값이라면 그냥 인덱스 플러스
		// k가 0이 될 때까지 반복........
		StringBuilder sb = new StringBuilder();
		int index = 0;
		int max = 0;
		for(int i=0; i<number.length() - k; i++) {
			max = 0;
			for(int j = index; j<= k+i; j++) {
				if(max < number.charAt(j)-'0') {
					max = number.charAt(j)-'0';
					index = j+1;
				}
			}
			sb.append(max);
		}
		return sb.toString();
	}
}
