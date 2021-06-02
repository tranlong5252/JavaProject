package net.tranlong5252.FH;
//PERFECTNUM

import java.util.Scanner;

public class FH_05_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) s += i;
        }
        if (s == n) System.out.println(1);
        else System.out.println(0);
    }
}