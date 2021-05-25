package net.tranlong5252;

import java.util.Scanner;

import static java.lang.Math.abs;

public class RutGonPhanSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (b == 0) {
            System.out.print("INVALID");
            return;
        }
        if (a == 0) {
            System.out.println(0);
            return;
        }
        if (a < 0 && b < 0) {
            a = abs(a);
            b = abs(b);
        }
        int i = USCLN(a, b);
        a = a / i;
        b = b / i;
        if (b == 1) {
            System.out.print(a);
            return;
        }
        if (b == -1) {
            System.out.print(-a);
        } else System.out.print(a + " " + b);
    }

    public static int USCLN(int a, int b) {
        a = abs(a);
        b = abs(b);
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
}  