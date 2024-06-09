package assignments;

import java.util.Scanner;

public class TrailingZeroes {
    public int getTheTrailingZeroesInFactorial(int n) {
        int count = 0;
        for(int i=5;i<=n;i=i*5) {
            count += n/i;
        }
        return count;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new TrailingZeroes().getTheTrailingZeroesInFactorial(n));


    }
}
