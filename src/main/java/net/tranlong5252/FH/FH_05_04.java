package net.tranlong5252.FH;

import java.util.Scanner;

//isPerfect
public class FH_05_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), n = sc.nextInt();
        sc.close();
        for (int i = a; i < n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPerfect(int n) {
        int s = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0)
                s += i;
        return s == n;
    }
}