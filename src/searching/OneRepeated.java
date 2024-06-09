package searching;

import java.util.Objects;

public class OneRepeated {

    // Pair Class
    static class Pair{
        long x;
        long y;

        Pair(long x, long y){
            this.x = x;
            this.y = y;
        }
    }
    //Function to find repeated element and its frequency.
    public static Pair findRepeating(Long arr[],int n)
    {
        //Your code here
        int low = 0, high = n-1;
        long repetitions = n-arr[n-1]-arr[0]+1;
        Pair p = new Pair(-1,-1);
        while(low<=high) {
            int mid = (low+high)/2;
            if((mid==0 && arr[mid]==arr[mid+1])||(mid==n-1 && arr[mid] == arr[mid-1])) {
                p.x = arr[mid];
                p.y = repetitions+1;
                break;
            } else if((mid != n-1 && arr[mid]==arr[mid+1]) || (mid != 0 && arr[mid]==arr[mid-1])) {
                p.x = arr[mid];
                p.y = repetitions+1;
                break;
            }
            else if(mid-low == arr[mid]-arr[low]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return p;
    }

    public static void main(String...args) {
        Long[] arr = {1L,2L,3L,4L,4L,4L};
        int n = arr.length;
        Pair p = findRepeating(arr, n);
        System.out.println(p.x+" "+p.y);
    }
}
