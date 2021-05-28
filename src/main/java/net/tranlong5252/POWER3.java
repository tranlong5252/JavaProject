package net.tranlong5252;

import java.util.Scanner;

public class POWER3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long n = sc.nextLong();
            long x = Math.round(Math.pow(n, 1.0 / 3));
            if (x * x * x == n)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}