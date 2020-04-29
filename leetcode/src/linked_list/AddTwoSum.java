package linked_list;

public class AddTwoSum {

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
