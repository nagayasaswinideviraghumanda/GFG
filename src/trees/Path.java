package trees;

import java.util.ArrayList;

public class Path {
   static ArrayList<Integer> l = new ArrayList<>();
    static void getPathOfNode(Node root, int key) {
        if(root == null) {
            return;
        }
        if(root.data == key) {
            l.add(root.data);
            return;
        }
        l.add(root.data);

    }

    public static void main(String...args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(8);
        getPathOfNode(root, 8);
        System.out.println(l);
    }
}
