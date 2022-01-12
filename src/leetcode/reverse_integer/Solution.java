package leetcode.reverse_integer;

import java.util.*;

class Solution {
	public int reverse(int x) {

		List<Integer> list = new ArrayList<>();

		int tmp = x;
		long answer = 0L;

		while (tmp != 0) {
			list.add(tmp % 10);
			tmp = tmp / 10;
		}

		int size = list.size();

		for (int i = 0; i < size; i++) {
			int j = size - i;
			answer += list.get(i) * Math.pow(10, j - 1);
		}

		if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int) answer;
		}

	}
}