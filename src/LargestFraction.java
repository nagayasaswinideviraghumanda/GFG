public class LargestFraction {

    public int[]  largestFraction(int n, int d)
    {
        // code here
        int[] arr = new int[2];
        int p = 1,q = 1;
        float f = n/d;
        for(q = d+1;q<=10000;q++) {
            p = (n*q)/d;
            if((f > (float)p/q) && (gcd(p,q)==1)) {
                arr[0] = p;
                arr[1] = q;
            }
        }
        return arr;
    }

    int gcd(int a,int b) {
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }

    public  static void main(String...args) {
        int n = 1;
        int d = 8;
        int[] res = new LargestFraction().largestFraction(n, d);
        System.out.println(res[0]+"/"+res[1]);
    }
}
