package trees;

public class Diameter {
    int height(Node root){
        if(root == null) {
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    int diameter(Node root) {
        // Your code here
        if(root == null) {
            return 0;
        }
        int d1 = height(root.left);
        int d2 = height(root.right);
        return d1+d2+1;
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
        System.out.println(new Diameter().diameter(root));
    }
}
