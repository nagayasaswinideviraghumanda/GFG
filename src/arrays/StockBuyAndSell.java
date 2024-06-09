import java.util.ArrayList;

public class StockBuyAndSell {
    ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {
        // code here

        ArrayList<ArrayList<Integer>> m = new ArrayList<ArrayList<Integer>>();
        int profitAmnt = 0;
        int buyIdx = 0, sellIdx = 0;
        for(int i = 1;i<n;i++) {
            if(arr[i]>arr[i-1]) {
                profitAmnt += arr[i]-arr[i-1];
                sellIdx = i;
            } else {
                if(profitAmnt > 0) {
                    ArrayList<Integer> s = new ArrayList<Integer>();
                    s.add(buyIdx);
                    s.add(sellIdx);
                    m.add(s);
                    profitAmnt = 0;
                }
                buyIdx = i;

            }
        }
        if(profitAmnt > 0) {
            ArrayList<Integer> s = new ArrayList<Integer>();
            s.add(buyIdx);
            s.add(sellIdx);
            m.add(s);
            profitAmnt = 0;
        }
        return m;
    }

    public static void main(String...args) {
        int[] arr = {100,180,260,310,40,535,695};
        int n = 7;
        ArrayList<ArrayList<Integer>> r = new StockBuyAndSell().stockBuySell(arr, n);
        for(ArrayList<Integer> a : r) {
            System.out.println(a.get(0) + " " + a.get(1));
        }
    }
}
