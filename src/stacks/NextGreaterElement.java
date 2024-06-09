package stacks;

import java.util.ArrayDeque;

public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long[] res = new long[n];
        ArrayDeque<Long> s = new ArrayDeque<>();
        for(int i=n-1;i>=0;i--) {
            while(!s.isEmpty() && arr[i]>=s.peek()) {
                s.pop();
            }
            if(s.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = s.peek();
            }
            s.push(arr[i]);
        }

        reverseArray(res);

        return res;
    }


    static void reverseArray(long[] arr) {
        int l =0,h=arr.length-1;
        while(l<h) {
            long t = arr[l];
            arr[l] = arr[h];
            arr[h]= t;
            l++;
            h--;
        }
    }

    public static void main(String...args) {
        long[] arr = {1, 3, 2, 4};
        long[] res = nextLargerElement(arr, arr.length);
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i] + " ");
        }
    }
}
