package net.tranlong5252;

import java.util.Scanner;

import static java.lang.Math.abs;

public class UCLN {
    public static int UCLN(int i1, int i2) {
        if (i1 % i2 == 0) return i2;
        if (i2 % i1 == 0) return i1;
        else return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a == 0 && b == 0) return;
        System.out.println(abs(UCLN(a, b)));
    }
}  