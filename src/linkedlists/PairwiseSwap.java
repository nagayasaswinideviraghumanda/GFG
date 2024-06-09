package linkedlists;

public class PairwiseSwap {
    public static Node pairwise_swap(Node head)
    {
        // your code here
        Node curr = head;
        Node prev = null;
        Node temp;
        if(head != null && head.next != null) {
            temp = head.next.next;
            head = head.next;
            head.next = curr;
            prev = curr;
            curr = temp;
        }

        while(curr != null && curr.next != null) {
            temp = curr.next.next;
            prev.next = curr.next;
            curr.next.next = curr;
            prev = curr;
            curr = temp;
        }

        if(curr != null) {
            prev.next = curr;
        }

        return head;

    }

    public static void main(String...args) {

        long startTime = System.currentTimeMillis();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);

        Node pairSwapList = pairwise_swap(head);
        while (pairSwapList != null) {
            System.out.print(pairSwapList.data + " ");
            pairSwapList = pairSwapList.next;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
