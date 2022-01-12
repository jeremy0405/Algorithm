package leetcode.two_sum;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		int size = nums.length;

		int[] answer = new int[2];

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (target == nums[i] + nums[j]) {
					answer[0] = i;
					answer[1] = j;
					return answer;
				}
			}
		}
		return answer;
	}

}


