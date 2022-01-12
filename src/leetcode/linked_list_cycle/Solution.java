package leetcode.linked_list_cycle;

import java.util.*;
import leetcode.remove_duplicates_from_sorted_list.ListNode;

public class Solution {
	public boolean hasCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();

		if (head == null) {
			return false;
		}

		ListNode tmpNode = head;
		while (tmpNode.next != null) {
			int beforeAdd = set.size();
			set.add(tmpNode);
			int afterAdd = set.size();
			tmpNode = tmpNode.next;
			if (beforeAdd == afterAdd) {
				return true;
			}
		}

		return false;
	}
}
