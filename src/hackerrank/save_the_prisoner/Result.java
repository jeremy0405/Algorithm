package hackerrank.save_the_prisoner;

/*
	문제    : HackerRank Save the Prisoner
    유형    :
	난이도   : Easy
	시간    :
	uri    : https://www.hackerrank.com/challenges/save-the-prisoner/problem
    날짜    : 22.01.26(o)
    refer  :
*/

public class Result {

	public static int saveThePrisoner(int n, int m, int s) {
		// Write your code here
		int result = (m % n + s - 1) % n;

		if (result == 0) {
			return n;
		}
		return result;
	}

}
