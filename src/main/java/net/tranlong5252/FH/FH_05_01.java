package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_05_01 {
    static boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if (n % 2 == 0 || (n <= 1))
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i <= n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
}