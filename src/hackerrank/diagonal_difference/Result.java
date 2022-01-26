package hackerrank.diagonal_difference;

import java.util.List;

class Result {

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int primaryDiagonal = 0;
		int secondaryDiagonal = 0;

		int size = arr.size();

		for (int i = 0; i < size; i++) {
			primaryDiagonal += arr.get(i).get(i);
			System.out.println(primaryDiagonal);
		}

		System.out.println(primaryDiagonal);

		for (int i = 0; i < size; i++) {
			secondaryDiagonal += arr.get(i).get(size - 1 - i);
		}

		System.out.println(secondaryDiagonal);

		return (int) Math.abs(primaryDiagonal - secondaryDiagonal);

	}

}
