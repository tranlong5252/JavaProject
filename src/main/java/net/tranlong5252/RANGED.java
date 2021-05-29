package net.tranlong5252;

import java.util.Scanner;

public class RANGED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
        if (a > d || b < c) {
            System.out.println("NO");
        } else System.out.println("YES");
    }
}
