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
    public ListNode reverseList(ListNode head) {

        ListNode reversedHead = head;
        ListNode curNode = head;
        int length = 0;
        while(curNode != null) {
            ListNode nodeCopy = new ListNode(curNode.val);
            if(length == 0) {
                nodeCopy.next = null;
            } else {
                nodeCopy.next = reversedHead;
            }
            length++;
            reversedHead = nodeCopy; 
            curNode = curNode.next;
        }

        return reversedHead;
    }
}
