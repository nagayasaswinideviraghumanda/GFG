package trees;

public class ChildrenSum {
    static int childSum(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = childSum(root.left);
        int rightSum = childSum(root.right);
        if(leftSum == Integer.MIN_VALUE || rightSum == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if(root.left == null && root.right == null) {
            return root.data;
        } else if(leftSum + rightSum == root.data) {
            return root.data;
        }
        return Integer.MIN_VALUE;
    }

    public static int isSumProperty(Node root)
    {
        // add your code here
        if(childSum(root) == Integer.MIN_VALUE) {
            return 0;
        } else {
            return 1;
        }
    }


    public static void main(String...args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.right.left = new Node(4);
        root.right.right = new Node(9);
        System.out.println(isSumProperty(root));
    }
}
