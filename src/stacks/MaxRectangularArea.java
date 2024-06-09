package stacks;

import java.util.ArrayDeque;

public class MaxRectangularArea {
    public static long getMaxArea(long hist[], long n)
    {
        // your code here
        ArrayDeque<Integer> s = new ArrayDeque<>();
        long area = 0, max = 0;
        for(int i = 0; i<n; i++) {
            while(!s.isEmpty() && hist[i]<=hist[s.peek()]) {
                long nextSmallerIdx = i;
                long prevSmallerIdx = -1;
                int t = s.pop();
                if(!s.isEmpty()) {
                    prevSmallerIdx = s.peek();
                }
                area = (nextSmallerIdx - prevSmallerIdx -1)*hist[t];
                max = Math.max(area, max);
            }
            s.push(i);
        }

        while(!s.isEmpty()) {
            long nextSmallerIdx = n;
            long prevSmallerIdx = -1;
            int t = s.pop();
            if(!s.isEmpty()) {
                prevSmallerIdx = s.peek();
            }
            area = (nextSmallerIdx - prevSmallerIdx -1)*hist[t];
            max = Math.max(area, max);
        }

        return max;
    }

    public static void main(String...args) {
        long[] hist = {6, 2, 5, 4, 5, 1, 6};
        System.out.println(getMaxArea(hist, hist.length));
    }
}
