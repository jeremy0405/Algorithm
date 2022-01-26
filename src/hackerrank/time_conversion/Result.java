package hackerrank.time_conversion;

/*
	문제    : HackerRank Time Conversion
    유형    :
	난이도   : Easy
	시간    :
	uri    : https://www.hackerrank.com/challenges/time-conversion/problem
    날짜    : 22.01.26(o)
    refer  :
*/

class Result {

	public static String timeConversion(String s) {
		// Write your code here
		String time;

		if (s.substring(s.length()-2, s.length()).equals("PM") && s.substring(0,2).equals("12")) {
			time = s.substring(0, s.length() - 2);
		} else if(s.substring(s.length()-2, s.length()).equals("AM") && s.substring(0,2).equals("12")) {
			time = "00" + s.substring(2, s.length()-2);
		} else if (s.substring(s.length()-2, s.length()).equals("PM")) {
			time = Integer.parseInt(s.substring(0, 2)) + 12 + s.substring(2, s.length()-2);
		} else {
			time = s.substring(0, s.length() - 2);
		}

		return time;

	}

}
