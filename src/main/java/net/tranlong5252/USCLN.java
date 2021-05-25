package net.tranlong5252;

import java.util.Scanner;

import static java.lang.Math.abs;

public class USCLN {
    public static int UCLN(int a, int b) {
        a = abs(a);
        b = abs(b);
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
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