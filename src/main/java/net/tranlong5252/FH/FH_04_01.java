package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_04_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), count = 0;
        for (int i = a; i <= b; i++) {
            if (ktra(i) && nto(i))
                count++;
        }
        System.out.println(count);
    }

    static boolean nto(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x % i == 0)
                return false;
        return true;
    }

    static boolean ktra(int x) {
        int tong = 0;
        boolean cs = true;
        while (x > 0) {
            int t = x % 10;
            if (t != 2 && t != 3 && t != 5 && t != 7)
                cs = false;
            tong = tong + t;
            x = x / 10;
        }
        return nto(tong) && cs;
    }
}