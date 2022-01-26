package hackerrank.number_line_jumps;

/*
	문제    : HackerRank Number Line Jumps
    유형    :
	난이도   : Easy
	시간    :
	uri    : https://www.hackerrank.com/challenges/kangaroo/problem
    날짜    : 22.01.26(o)
    refer  :
*/

public class Result {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		// Write your code here
		// x1 < x2
		String answer;

		if (v1 == v2) {
			return "NO";
		} else if (v1 < v2) {
			return "NO";
		} else {
			int i = 0;
			while (true) {
				if ((x1 + i * v1) == (x2 + i * v2)) {
					return "YES";
				} else if ((x1 + i * v1) > (x2 + i * v2)) {
					return "NO";
				} else {
					i++;
				}
			}
		}

	}

}
