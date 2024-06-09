package conversions;



import java.util.ArrayDeque;
import java.util.Deque;

public class ConvLLtoDLL {
    public static Tree convert(Node head, Tree node) {
        // add code here.
        Deque<Tree> q = new ArrayDeque<>();
        if(node != null) {
            node = new Tree(head.data);
            q.offer(node);
        }
        Node curr = head.next;
        Tree k;
        while(curr != null && curr.next != null) {
            k = q.poll();
            k.left = new Tree(curr.data);
            k.right = new Tree(curr.next.data);
            q.offer(k.left);
            q.offer(k.right);
            curr = curr.next.next;
        }

        if(curr != null) {
            k = q.poll();
            k.left = new Tree(curr.data);
        }
        return node;
    }

    void inorder(Tree root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String...args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        Tree node = new Tree(head.data);
        Tree root = convert(head, node);
        System.out.println("Inorder Traversal of the tree");
        new ConvLLtoDLL().inorder(root);
    }
}
