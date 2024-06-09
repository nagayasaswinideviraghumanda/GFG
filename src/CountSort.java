public class CountSort {

    void countSort(int[] arr, int n) {
        int max = arr[0];
        for(int i = 1;i<n;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for(int i = 0;i<n;i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for(int i = 0;i<=max;i++) {
            for(int j = 0;j<count[i];j++) {
                arr[k++] = i;
            }
        }

    }

    public static void main(String...args) {
        int[] arr = {4,1,3,9,7};
        int n = 5;
        new CountSort().countSort(arr, n);
        for(int i = 0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
