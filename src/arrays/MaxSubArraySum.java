import java.util.ArrayList;
public class MaxSubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int start = 0, end = 0;
        int currSum = arr[end];
        boolean isExists = false;
        while(end<n-1) {
            if(s==arr[end+1]) {
                start = end;
                isExists = true;
                break;
            } else if(s == currSum) {
                isExists = true;
                break;
            } else if(currSum+arr[end+1] <= s) {
                end++;
                currSum += arr[end];
            } else {
                currSum -= arr[start];
                start++;
            }
        }
        ArrayList<Integer> l = new ArrayList<Integer>();
        if(isExists) {
            l.add(start+1);
            l.add(end+1);
        } else {
            l.add(-1);
        }
        return l;

    }
    public static void main(String...args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = 10;
        int s = 4;
        System.out.println(subarraySum(arr, n, s));
    }
}
