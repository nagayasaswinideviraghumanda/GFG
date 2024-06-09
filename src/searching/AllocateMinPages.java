package searching;

public class AllocateMinPages {
    public static int findPages(int[] arr,int n,int m)
    {
        //Your code here
        int totalPages = 0;
        int maxPages = arr[0];
        for(int i=0;i<n;i++) {
            totalPages += arr[i];
            maxPages = Math.max(arr[i], maxPages);
        }

        int low = maxPages, high = totalPages;
        int res = -1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(isFeasible(arr,n,m,mid)) {
                res = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return res;

    }

    static boolean isFeasible(int[] arr, int n, int m, int ans) {
        int s = arr[0];
        int req = 1;
        for(int i=1;i<n;i++) {
            if(s+arr[i] <= ans) {
                s+=arr[i];
            } else {
                s = arr[i];
                req++;
            }
        }

        return (req <= m);
    }

    public static void main(String...args) {
        int[] arr = {12,34,67,90};
        int n = arr.length;
        int m = 5;
        int res = findPages(arr, n, m);
        System.out.println(res);
    }
}
