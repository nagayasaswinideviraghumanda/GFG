package assignments;

import java.util.Scanner;

public class Prime {
    public boolean isPrime(int n) {
        if(n == 1)
            return false;
        if(n % 2 == 0 || n % 3 == 0)
            return false;
        for(int i = 5; i*i <= n;i = i+6) {
            if(n%i == 0 || n%(i+2) == 0)
                return false;
        }
        return true;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new Prime().isPrime(n));
    }
}
