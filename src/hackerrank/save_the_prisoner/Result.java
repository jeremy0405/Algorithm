package hackerrank.save_the_prisoner;

public class Result {

	public static int saveThePrisoner(int n, int m, int s) {
		// Write your code here
		int result = (m % n + s - 1) % n;

		if (result == 0) {
			return n;
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(saveThePrisoner(3, 809644536, 3));
		System.out.println(saveThePrisoner(91, 111224659, 1));

	}

}
