package trees;

import java.util.ArrayList;

public class Serialization {
    // Function to serialize a tree and return a list containing nodes of tree.
    ArrayList<Integer> l = new ArrayList<>();
    public ArrayList<Integer> serialize(Node root) {
        // code here
        serialization(root);
        return l;
    }

    void serialization(Node root) {
        if(root == null) {
            l.add(-1);
            return;
        }
        l.add(root.data);
        serialization(root.left);
        serialization(root.right);
    }


    // Function to deserialize a list and construct the tree.
    static int index = -1;
    public Node deSerialize(ArrayList<Integer> A) {
        // code here
        index++;
        if(A.get(index)==-1) {
            return null;
        }
        Node root = new Node(A.get(index));
        root.left = deSerialize(A);
        root.right = deSerialize(A);
        return root;
    }

    void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

public static void main(String...args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Serialization s = new Serialization();
        ArrayList<Integer> l = s.serialize(root);
        System.out.println(l);
        Node newRoot = s.deSerialize(l);
        s.inOrder(newRoot);

    }

}
