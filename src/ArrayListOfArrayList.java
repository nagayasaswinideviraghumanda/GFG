import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListOfArrayList {
    public List<ArrayList<Integer>> separateChaining(int[] arr, int n, int hashSize)
    {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i = 0;i<n;i++) {
            int position = arr[i]%hashSize-1;

            if(l.get(position) != null) {
                l.get(position).add(arr[i]);
            } else {
                ArrayList<Integer> s = new ArrayList<>();
                s.add(arr[i]);
                l.add(s);
            }
        }
        l.sort(Comparator.comparingInt((ArrayList<Integer> innerList) -> innerList.get(0)));
        return l;
    }


    public static void main(String...args) {
        int[] arr = {92,4,14,24,44,91};
        int n = 6;
        int hashSize = 10;
        System.out.println(new ArrayListOfArrayList().separateChaining(arr, n, hashSize));
    }
}
