package Programmers.신규아이디추천;

/*
	문제    : 프로그래머스 신규 아이디 추천
    유형    :
	난이도   : EASY(level 1)
	시간    : 20m
	uri    : https://programmers.co.kr/learn/courses/30/lessons/72410?language=java
    날짜    : 22.04.19(o)
    refer  :
*/

public class Solution {

	public String solution(String new_id) {
		new_id = new_id.toLowerCase();

		String id = "";
		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch == '.' || ch == '-' || ch == '_')) {
				id += String.valueOf(ch);
			}
		}

		for (int i = 0; i < id.length(); i++) {
			if (id.charAt(i) == '.') {
				int j = i + 1;
				String dot = ".";

				while (j != id.length() && id.charAt(j) == '.') {
					dot += ".";
					j++;
				}

				if (dot.length() > 1) {
					id = id.replace(dot, ".");
				}
			}
		}

		if (id.startsWith(".")) {
			id = id.substring(1);
		} else if (id.endsWith(".")) {
			id = id.substring(0, id.length() - 1);
		}

		if (id.length() == 0) {
			id += "a";
		}

		if (id.length() >= 16) {
			id = id.substring(0, 15);
		}

		if (id.endsWith(".")) {
			id = id.substring(0, id.length() - 1);
		}

		String last = id.charAt(id.length() - 1) + "";
		if (id.length() == 2) {
			id = id + last;
		} else if (id.length() == 1) {
			id = id + last + last;
		}

		return id;
	}
}
