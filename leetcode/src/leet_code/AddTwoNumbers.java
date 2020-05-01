package leet_code;

public class AddTwoNumbers {

	/*
	 * Problem ID : 2 (Medium)
	 * 
	 * You are given two non-empty linked lists representing two non-negative
	 * integers. The digits are stored in reverse order and each of their nodes
	 * contain a single digit. Add the two numbers and return it as a linked list.
	 * 
	 * You may assume the two numbers do not contain any leading zero, except the
	 * number 0 itself.
	 * 
	 * Example:
	 * 
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	 * 
	 * Output: 7 -> 0 -> 8
	 * 
	 * Explanation: 342 + 465 = 807.
	 */

	public class ListNode {

		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	}

	class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			int carry = 0;
			int sum = 0;

			// empty answer linked list
			ListNode ans = new ListNode();

			// adding values of l1 & l2 if they are not null
			if (l1 != null && l2 != null) {
				// calculating sum
				sum = (l1.val + l2.val + carry);

				// calculating carry if any
				carry = sum / 10;

				// assign sum to the ans
				ans.val = sum % 10;

				// moves both l1 & l2 to next node
				l1 = l1.next;
				l2 = l2.next;
			}

			// head of the answer linked list
			ListNode head = ans;

			// loop until any of linked list reachs end
			while (l1 != null && l2 != null) {
				// sum the value of linked list node
				sum = (l1.val + l2.val + carry);
				// calculating carry
				carry = sum / 10;

				// new node to store current nodes sum
				ListNode nn = new ListNode(sum % 10);

				// connecting new node to the answer node
				ans.next = nn;

				// moves the references to next node
				ans = ans.next;
				l1 = l1.next;
				l2 = l2.next;

			}

			// l2 is empty but l1 not
			if (l1 != null) {
				while (l1 != null) {
					sum = l1.val + carry;
					ListNode nn = new ListNode(sum % 10);

					ans.next = nn;

					ans = ans.next;
					carry = sum / 10;
					l1 = l1.next;

				}
			}
			// l1 is empty but l2 not
			if (l2 != null) {
				while (l2 != null) {
					sum = l2.val + carry;
					ListNode nn = new ListNode(sum % 10);

					ans.next = nn;

					ans = ans.next;
					carry = sum / 10;
					l2 = l2.next;

				}
			}
			// if any carry remained
			if (carry != 0) {
				ListNode nn = new ListNode(carry);
				ans.next = nn;
				ans = ans.next;
				carry = 0;
			}

			// return the head
			return head;
		}
	}

}
