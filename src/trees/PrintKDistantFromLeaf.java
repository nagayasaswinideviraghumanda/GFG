package trees;

public class PrintKDistantFromLeaf {

        static int count = 0;
        void printKDistantFromLeaf(int k, boolean[] visited,int pathLength, Node root) {
                if(root == null) {
                        return;
                }

                if(root.left == null && root.right == null && pathLength-k>=0 && !visited[pathLength-k]) {
                        visited[pathLength-k] = true;
                        count++;
                }
                visited[pathLength] = false;
                printKDistantFromLeaf(k,visited,pathLength+1,root.left);
                printKDistantFromLeaf(k,visited,pathLength+1,root.right);
        }

        //Function to return count of nodes at a given distance from leaf nodes.
        int printKDistantfromLeaf(Node root, int k)
        {
                // Write your code here
                boolean[] visited = new boolean[1000];
                printKDistantFromLeaf(k,visited,0,root);
                return count;
        }

        public static void main(String...args) {
                Node root = new Node(1);
                root.left = new Node(2);
                root.right = new Node(3);
                root.left.left = new Node(4);
                root.left.right = new Node(5);
                root.right.left = new Node(6);
                root.right.right = new Node(7);

                System.out.println(new PrintKDistantFromLeaf().printKDistantfromLeaf(root,3));
        }

}
