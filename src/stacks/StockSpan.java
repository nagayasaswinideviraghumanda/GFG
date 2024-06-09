package stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int[] arr = new int[n];
        ArrayDeque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<price.length;i++) {
            while(!s.isEmpty() && price[i]>=price[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()) {
                arr[i] = i+1;
            } else {
                arr[i] = i-s.peek();
            }
            s.push(i);
        }

        return arr;

    }

    public static void main(String...args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(price, price.length);
        for(int i=0;i<span.length;i++) {
            System.out.print(span[i] + " ");
        }
    }
}
