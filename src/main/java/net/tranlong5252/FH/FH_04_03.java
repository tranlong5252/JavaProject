package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_04_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for (int i = (int) Math.pow(10, a - 1); i <= Math.pow(10, a); i++) {
            if (flus(i) == 1 && snt(i) == 1 || neft(i) == 1 && snt(i) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    static int snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return 0;
        }
        return 1;
    }

    static int flus(int n) {
        while (n > 10) {
            int a = n % 10;
            n /= 10;
            int b = n % 10;
            if (a <= b) return 0;
        }
        return 1;
    }

    static int neft(int n) {
        while (n > 10) {
            int a = n % 10;
            n /= 10;
            int b = n % 10;
            if (a >= b) return 0;
        }
        return 1;
    }
}