import java.util.ArrayList;

public class ReverseArrayInGroups {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0;i<n;i=i+k) {
            if(i+k-1>n) {
                reverse(arr,i,n-1);
            } else {
                reverse(arr, i, i + k - 1);
            }

        }
    }

    void reverse(ArrayList<Integer> arr, int low, int high) {
        while(low<high) {
            int t = arr.get(low);
            arr.set(low,arr.get(high));
            arr.set(high,t);
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        ReverseArrayInGroups rag = new ReverseArrayInGroups();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        rag.reverseInGroups(arr,10,3);
        System.out.println(arr);
    }
}
