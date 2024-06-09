package queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenBinNum {
    static ArrayList<String> generate(int N)
    {
        // Your code here
        Queue<String> q = new LinkedList<>();
        ArrayList<String> l = new ArrayList<>();

        q.offer("1");
        while(l.size() <= N) {
            String t = q.poll();
            l.add(t);
            q.offer(t + "0");
            q.offer(t + "1");
        }

        if(l.size()>N) {
            l.remove(l.size()-1);
        }

        return l;
    }

    public static void main(String...args) {
        System.out.println(generate(5));
    }
}
