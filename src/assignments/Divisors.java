package assignments;

import java.util.Scanner;

public class Divisors {
    public void printDivisors(int n) {
        int i;
        for(i = 1;i*i <= n;i++)
            if(n%i==0)
                System.out.println(i);

        for(;i>0;i--) {
            if(n%i == 0)
                System.out.println(i);
        }
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new Divisors().printDivisors(n);
    }
}
