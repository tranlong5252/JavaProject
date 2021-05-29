package net.tranlong5252;

import java.util.Scanner;

public class SIMMATH {
    final static long mod = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            a = a * (a + 1) / 2 % mod;
            b = b * (b + 1) / 2 % mod;
            c = c * (c + 1) / 2 % mod;
            long ans = a * b % mod * c % mod;
            t--;
            System.out.println(ans);
        }
    }
}
