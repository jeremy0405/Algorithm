package Programmers.조이스틱;

/*
	문제    : 프로그래머스 조이스틱
    유형    : 그리디
	난이도   : HARD (level2)
	시간    : 45m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/42860
    날짜    : 22.08.31(o)
    refer  :
*/

class Solution {

	public int solution(String name) {
		int answer = 0;

		char start = 'A';
		char end = 'Z' + 1;

		int cursor = name.length() - 1;

		for (int i = 0; i < name.length(); i++) {
			char tmp = name.charAt(i);
			answer += Math.min(tmp - start, end - tmp);

			int conA = i + 1;
			while (conA < name.length() - 1 && name.charAt(conA) == 'A') {
				conA++;
			}
			cursor = Math.min(cursor,
				i + (name.length() - conA) + Math.min(i, name.length() - conA));
		}

		return answer + cursor;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution("JEROEN"));
		System.out.println(solution.solution("JAN"));
	}

}
