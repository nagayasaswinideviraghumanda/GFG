package linkedlists;

public class SwapKthNodeFromEnd {
    Node swapkthnode(Node head, int num, int k)
    {
        // your code here
        Node curr = head;
        Node n1 = curr;
        for(int i=1;i<num-k && curr!= null;i++) {
            if(i == k-1) {
                n1 = curr;
            }
            curr = curr.next;

        }
        Node n2 = curr;
        if(n1== null || n2==null) {
            return head;
        }

        if(k==1) {
            Node temp1 = head;
            head = n2.next;
            head.next = temp1.next;
            n2.next = temp1;
            n2.next.next = null;
            return head;
        }

        Node temp1 = n1.next;
        Node temp2 = n2.next;

        n1.next = temp2;
        n2.next = temp1;

        n1.next.next = temp1.next;
        n2.next.next = temp2.next;

        return head;

    }
    public static void main(String...args) {

        Node num1 = new Node(1);
        num1.next = new Node(2);
        num1.next.next = new Node(3);
        num1.next.next.next = new Node(4);
        num1.next.next.next.next = new Node(5);
        num1.next.next.next.next.next = new Node(6);
        /* num1.next.next.next.next.next.next = new Node(7);
        num1.next.next.next.next.next.next.next = new Node(8);
        num1.next.next.next.next.next.next.next.next = new Node(9);*/

        Node swapList = new SwapKthNodeFromEnd().swapkthnode(num1,6,2);
        while(swapList != null) {
            System.out.print(swapList.data + " ");
            swapList = swapList.next;
        }
    }
}
