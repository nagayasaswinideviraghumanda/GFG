package trees;

public class Height {
    int height(Node node)
    {
        // code here
        if(node == null) {
            return 0;
        }
        return 1+Math.max(height(node.left),height(node.right));
    }

    public static void main(String...args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(new Height().height(root));
    }
}
