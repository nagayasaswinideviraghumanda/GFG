package assignments;

import java.util.Scanner;

public class Factorial {
    public int getFactorial(int n) {
        int factor = 1;
        while(n>1) {
             factor = factor*(n-1);
             n-=1;
        }
        return factor;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new Factorial().getFactorial(n));
    }
}
