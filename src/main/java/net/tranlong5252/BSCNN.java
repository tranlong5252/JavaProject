package net.tranlong5252;

import java.util.Scanner;

import static java.lang.Math.abs;

public class BSCNN {

    public static int BCNN(int a, int b) {
        a = abs(a);
        b = abs(b);
        if (a % b == 0) return a;
        if (b % a == 0) return b;
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a * b == 0) return;
        System.out.print(BCNN(a, b));
    }
}  