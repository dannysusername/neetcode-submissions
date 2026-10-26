/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        HashMap<Node, Node> map = new HashMap<>();
        Node pointer = head;
        
        while(pointer != null) {
            map.put(pointer, new Node(pointer.val));
            pointer = pointer.next;
        }

        pointer = head;

        while(pointer != null) {
            map.get(pointer).next = map.get(pointer.next);
            map.get(pointer).random = map.get(pointer.random);
            pointer = pointer.next;

        }

        return map.get(head);



        

    
    }
}
