package Programmers.전화번호목록;

/*
	문제    : 프로그래머스 전화번호 목록
    유형    : 해시
	난이도   : MEDIUM (level2)
	시간    : 40m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/42577
    날짜    : 22.08.02(o)
    refer  :
*/

import java.util.*;

class Solution {
	public boolean solution(String[] phone_book) {
		Set<String> set = new HashSet<>(Arrays.asList(phone_book));

		for(int i = 0 ; i < phone_book.length ; i++){
			for(int j = 1 ; j <phone_book[i].length(); j++ ){
				if(set.contains(phone_book[i].substring(0,j))) {
					return false;
				}
			}
		}

		return true;
	}
}

