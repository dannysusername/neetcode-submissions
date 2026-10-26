/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int remainder = 0;

        while(pointer1 != null || pointer2 != null) {
            int x = pointer1 != null ? pointer1.val : 0;
            int y = pointer2 != null ? pointer2.val : 0;

            int sum = x + y + remainder;

            remainder = sum / 10;
            int result = sum % 10;

            ListNode newNode = new ListNode(result);
            tail.next = newNode;
            tail = newNode;

            if(pointer1 != null) { 
                pointer1 = pointer1.next;
            }
            if(pointer2 != null) { 
                pointer2 = pointer2.next; 
            }

        }

        if(remainder != 0) {
            ListNode newNode = new ListNode(remainder);
            tail.next = newNode;
        }

        return dummy.next;

    }
}
