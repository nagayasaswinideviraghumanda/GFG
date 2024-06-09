package linkedlists;

import java.util.HashSet;

public class RemoveDuplicates {
    public Node removeDuplicates(Node head)
    {
        // Your code here
        HashSet<Integer> h = new HashSet<>();
        if(head == null) {
            return head;
        }
        h.add(head.data);
        Node curr = head;
        while(curr.next != null) {
            if(h.contains(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                h.add(curr.data);
            }

        }
        return head;
    }

    public static void main(String...args) {

        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(6);
        /* head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);*/

        Node uniqueList = new RemoveDuplicates().removeDuplicates(head);
        while(uniqueList != null) {
            System.out.print(uniqueList.data + " ");
            uniqueList = uniqueList.next;
        }
    }
    
    

}
