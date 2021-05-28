package net.tranlong5252.SUM;

import java.util.Scanner;

class SUM4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        double Sn;
        for (int i = 0; i < T; i++) {
            int m = sc.nextInt();
            Sn = 2 - 2.0 / (m + 1);
            System.out.printf("%.8f\n", Sn);
        }
    }
}
