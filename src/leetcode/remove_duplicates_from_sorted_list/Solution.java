package leetcode.remove_duplicates_from_sorted_list;

class Solution {
	public ListNode deleteDuplicates(ListNode head) {

		ListNode tmpNode = head;

		if (head == null) {
			return head;
		}

		while (tmpNode.next != null) {
			ListNode nextNode = tmpNode.next;
			if (tmpNode.val == nextNode.val) {
				tmpNode.next = nextNode.next;
				continue;
			}
			tmpNode = nextNode;
		}
		return head;
	}
}
