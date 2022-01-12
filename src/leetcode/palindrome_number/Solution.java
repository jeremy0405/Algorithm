package leetcode.palindrome_number;

class Solution {
	public boolean isPalindrome(int x) {
		String input = String.valueOf(x);

		int length = input.length();

		char[] output = new char[length];

		int j = 0;
		for (int i = length - 1; i >= 0; i--) {
			output[j++] = input.charAt(i);
		}

		String stringOutput = String.valueOf(output);

		if (stringOutput.equals(input)) {
			return true;
		} else {
			return false;
		}

	}
}
