package linkedlists;

public class RotateLeft {
    public Node rotate(Node head, int k) {
        // add code here
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        Node headRef = head;
        Node tailRef = curr;

        for(int i=0;i<k;i++) {
            Node temp = headRef;
            headRef = headRef.next;
            tailRef.next = temp;
            tailRef = tailRef.next;
        }
        tailRef.next= null;

        return headRef;
    }

    public static void main(String...args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        /* head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);*/

        Node rotatedList = new RotateLeft().rotate(head,3);
        while(rotatedList != null) {
            System.out.print(rotatedList.data + " ");
            rotatedList = rotatedList.next;
        }
    }
}
