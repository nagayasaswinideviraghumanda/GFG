package searching;

public class TwoRepeated {
    public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        int size = n+2;
        int[] res = new int[2];
        for(int i=0;i<size;i++) {
            arr[i]*=size;
        }
        int j=-1;
        for(int i=0;i<size;i++) {
            arr[arr[i]/size-1]++;
            if(arr[arr[i]/size-1]%size==2) {
                res[++j] = arr[i]/size;
                if(j==1) {
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String...args) {
        int[] arr = {1,2,2,1};
        int n = 2;
        int[] res = new TwoRepeated().twoRepeated(arr, n);
        for(int i:res) {
            System.out.print(i+" ");
        }
    }
}
