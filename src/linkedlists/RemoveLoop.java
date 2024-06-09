package linkedlists;

public class RemoveLoop {
    public Node removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes

        Node fast = head;
        Node slow = head;

        boolean isLoopExist = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                isLoopExist = true;
                break;
            }
        }

        if(isLoopExist) {
            fast = head;
            while (fast.next != slow.next) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = null;
        }
        return head;
    }

    public static void main(String...args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = head.next.next.next.next.next;

        Node unloopedList = new RemoveLoop().removeLoop(head);
        while(unloopedList != null) {
            System.out.print(unloopedList.data + " ");
            unloopedList = unloopedList.next;
        }
    }
}
