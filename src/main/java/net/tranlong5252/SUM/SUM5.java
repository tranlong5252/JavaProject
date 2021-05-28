package net.tranlong5252.SUM;

import java.util.Scanner;

public class SUM5 {
    // n = 1 + 1/2 + 1/3 + ... + 1/n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] x = new int[T];
        for (int i = 0; i < T; i++) {
            x[i] = sc.nextInt();
            double s = 0;
            for (int j = 1; j <= x[i]; j++)
                s += (double) 1 / j; //time limit
            System.out.printf("%.5f\n", s);
        }
    }
}