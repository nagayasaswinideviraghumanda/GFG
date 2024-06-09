package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class LevelOrderTraversal {
    static ArrayList <Integer> levelOrder(Node root)
    {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> l = new ArrayList<>();
        while(!q.isEmpty()) {
            int count = q.size();
            for(int i=0;i<count;i++) {
                Node curr = q.poll();
                l.add(curr.data);
                if(curr.left!=null) {
                    q.add(curr.left);
                }
                if(curr.right!=null) {
                    q.add(curr.right);
                }
            }
        }
        return l;
    }



}
