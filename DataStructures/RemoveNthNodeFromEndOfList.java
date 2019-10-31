/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        int index = length - n;
        current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        if (index == 0) {
            head = head.next;
        }
        else if (current.next != null) {
            current.next = current.next.next;
        }
        else {
            head = null;
        }
        return head;
    }
}