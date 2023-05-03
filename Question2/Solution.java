package Question2;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        ListNode result = new ListNode();

        if (l1 != null || l2 != null) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;

            int sum = v1 + v2 + carry;
            if (sum >= 10) {
                carry = 1;
                result.val = sum - 10;
            } else {
                result.val = sum;
                carry = 0;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            result.next = addTwoNumbers(l1, l2, carry);
        } else {
            if (carry == 1) {
                result.val = 1;
                carry = 0;
            } else {
                result = null;
            }
        }
        return result;
    }
}