package trees;

public class Identical {
    boolean isIdentical(Node root1, Node root2)
    {
        // Code Here
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 != null  && root2 == null) {
            return false;
        }
        if(root1 == null  && root2 != null) {
            return false;
        }
        if(root1.data == root2.data) {
            return isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
        }
        return false;
    }

    public static void main(String...args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.right= new Node(4);
        root1.left.right= new Node(4);
        System.out.println(new Identical().isIdentical(root1,root2));
    }
}
