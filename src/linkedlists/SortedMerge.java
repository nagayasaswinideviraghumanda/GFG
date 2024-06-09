package linkedlists;

public class SortedMerge {

    Node sortedMerge(Node head1, Node head2) {
        // This is a "method-only" submission.
        // You only need to complete this method

        Node head = null, tail = null;
        if(head1.data <= head2.data) {
            head = head1;
            tail = head1;
            head1 = head1.next;
        } else {
            head = head2;
            tail = head2;
            head2 = head2.next;
        }

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        while(head1 != null) {
            tail.next = head1;
            head1 = head1.next;
            tail = tail.next;
        }

        while(head2 != null) {
            tail.next = head2;
            head2 = head2.next;
            tail = tail.next;
        }

        tail.next = null;

        return head;


    }

    public static void main(String...args) {

        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);
        head1.next.next.next.next = new Node(9);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);
        head2.next.next.next.next = new Node(10);

        Node mergedList = new SortedMerge().sortedMerge(head1, head2);
        while(mergedList != null) {
            System.out.print(mergedList.data + " ");
            mergedList = mergedList.next;
        }
    }

}
