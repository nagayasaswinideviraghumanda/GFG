package linkedlists;

public class IntersectionPoint {
    Node intersectPoint(Node head1, Node head2)
    {
        // code here
        Node curr1 = head1, curr2 = head2;;
        int c1 = 0, c2 = 0;

        while(curr1 != null || curr2!=null) {
            if(curr1!=null) {
                curr1 = curr1.next;
                c1++;
            }
            if(curr2 != null) {
                curr2 = curr2.next;
                c2++;
            }
        }

        if(c1>c2) {
            curr1 = head1;
            curr2 = head2;
        } else {
            curr1 = head2;
            curr2 = head1;
        }

        for(int i=0;i<Math.abs(c1-c2);i++) {
            curr1 = curr1.next;
        }

        while(curr1 != curr2) {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return curr1;
    }

    public static void main(String...args) {

        Node num1 = new Node(1);
        num1.next = new Node(2);
        num1.next.next = new Node(3);
        num1.next.next.next = new Node(10);
        num1.next.next.next.next = new Node(11);
        Node num2 = new Node(7);
        num2.next = new Node(8);
        num2.next.next = new Node(9);
        Node num3 = new Node(4);
        num3.next = new Node(5);
        num3.next.next = new Node(6);
        num1.next.next.next.next.next = num3;
        num2.next.next.next = num3;

        Node commonList = new IntersectionPoint().intersectPoint(num1,num2);
        while(commonList != null) {
            System.out.print(commonList.data + " ");
            commonList = commonList.next;
        }
    }
}
