package Programmers.괄호변환;

/*
	문제    : 괄호변환
    유형    :
	난이도   : (level 2)
	시간    : m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/60058
    날짜    : 22.09.10(o)
    refer  :
*/

class Solution {
	public String solution(String p) {
		if (p.length() == 0) {
			return "";
		}



		StringBuilder answer = new StringBuilder();

		int c1 = 0;
		int c2 = 0;
		StringBuilder u = new StringBuilder();

		boolean perfect = true;

		for (int i = 0; i < p.length(); i++) {
			u.append(p.charAt(i));

			if (p.charAt(i) == '(') {
				c1++;
			} else {
				c2++;
			}

			if (c1 - c2 < 0) {
				perfect = false;
			}

			if (c1 > 0 && c2 > 0 && c1 == c2) {

				if (!perfect) {
					answer.append("(".repeat(c1));
					answer.append(")".repeat(c1));
				} else {
					answer.append(u);
				}

				c1 = 0;
				c2 = 0;
				perfect = true;
				u = new StringBuilder();
			}
		}
		return answer.toString();
	}
}
