/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode previous = new ListNode(0);
        previous.next = head;
        ListNode current = head;
        while (head.val == val) {
            head = head.next;
            if (head == null) return head;
        }
        while (current != null) {
            if (current.val == val) {
                previous.next = current.next;
                current = current.next;
            }
            else {
                previous = previous.next;
                current = current.next;
            }
        }
        return head;
    }
}