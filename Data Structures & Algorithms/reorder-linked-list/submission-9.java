class Solution {
    public void reorderList(ListNode head) {
        ListNode temp = head;
        Deque<ListNode> stack = new ArrayDeque<>();
        int length = 0;

        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
            length++;
        }

        ListNode p1 = head;
        ListNode p2 = p1.next;

        for (int i = 0; i < (length - 1) / 2; i++) {
            ListNode top = stack.pop();
            top.next = p2;
            p1.next = top;

            p1 = p2;        // was p2 = p1
            p2 = p2.next;
        }

        ListNode tail = stack.pop();
        tail.next = null;
    }
}