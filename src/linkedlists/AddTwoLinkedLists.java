package linkedlists;


public class AddTwoLinkedLists {
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list

        long n1 = 0, n2=0;
        while(num1 != null) {
            n1 = n1*10 + num1.data;
            num1 = num1.next;
        }
        //6455257479
        while(num2 != null) {
            n2 = n2*10 + num2.data;
            num2 = num2.next;
        }

        long n = n1+n2;

        Node sumList = null;
        if(n== 0) {
            return new Node(0);
        }
        while(n != 0){
            long d = n%10;
            sumList = insertBegin(sumList,(int)d);
            n=n/10;
        }
        return sumList;
    }


    static Node insertBegin(Node head, int data) {
        Node n = new Node(data);
        if(head != null) {
            n.next = head;
        }
        return n;
    }

    public static void main(String...args) {

        /*
        7 : num1 has 7 nodes
        value of each node are in order
        0 0 0 0 0 0 0
        7 num2 linked had 7 nodes
        value of each node are in order
        0 0 0 0 0 0 0
        pass this as input values to the function addTwoLists
         */

        Node num1 = new Node(0);
        num1.next = new Node(0);
        num1.next.next = new Node(0);
        num1.next.next.next = new Node(0);
        num1.next.next.next.next = new Node(0);
        num1.next.next.next.next.next = new Node(0);
        num1.next.next.next.next.next.next = new Node(0);

        Node num2 = new Node(0);
        num2.next = new Node(0);
        num2.next.next = new Node(0);
        num2.next.next.next = new Node(0);
        num2.next.next.next.next = new Node(0);
        num2.next.next.next.next.next = new Node(0);
        num2.next.next.next.next.next.next = new Node(0);

        Node sumList = addTwoLists(num1, num2);
        while(sumList != null) {
            System.out.print(sumList.data + " ");
            sumList = sumList.next;
        }
    }


}
