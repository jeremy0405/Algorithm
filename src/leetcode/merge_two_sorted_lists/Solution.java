package leetcode.merge_two_sorted_lists;

/*
	문제    : Merge Two Sorted Lists
    유형    :
	난이도  : Easy
	시간    :
	uri    : https://leetcode.com/problems/merge-two-sorted-lists/
    날짜    : 22.01.15(o)
    refer :
*/

import leetcode.remove_duplicates_from_sorted_list.ListNode;

class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		if (list1 == null) {
			return list2;
		}

		if (list2 == null) {
			return list1;
		}

		if (list1.val > list2.val) {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		} else {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		}

	}
}
