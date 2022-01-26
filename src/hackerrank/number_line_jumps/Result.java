package hackerrank.number_line_jumps;

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
