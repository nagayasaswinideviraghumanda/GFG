package linkedlists;

public class MiddleInsertion {
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node fast = head;
        Node slow = head;
        if(head == null) {
            return new Node(data);
        }
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node temp = new Node(data);
        temp.next = slow.next;
        slow.next = temp;

        return head;
    }

    public static void main(String...args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        new MiddleInsertion().insertInMid(head, 3);
    }
}
