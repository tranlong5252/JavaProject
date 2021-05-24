package net.tranlong5252;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int fac = 1;
        if (n == 0) {
            System.out.print(fac);
            return;
        }
        if (n > 12) return;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        System.out.print(fac);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static float exp(int pow, int num) {
        if (pow < 1)
            return 1;
        else
            return num * exp(pow - 1, num);
    }
}
