import static java.util.stream.Collectors.joining;

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
