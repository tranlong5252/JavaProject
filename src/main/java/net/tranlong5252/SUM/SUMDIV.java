package net.tranlong5252.SUM;

import java.util.Scanner;

public class SUMDIV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int temp = t;
        int[] b = new int[t];
        while (t > 0) {
            int n;
            n = scanner.nextInt();
            int p = (int) Math.sqrt(n);

            if (p * p == n) {
                for (int i = 1; i < p; i++) {
                    if (n % i == 0) {
                        b[t - 1] += (i + (n / i));
                    }
                }
                b[t - 1] += p;
            } else {
                for (int i = 1; i <= p; i++) {
                    if (n % i == 0) {
                        b[t - 1] += (i + (n / i));
                    }
                }
            }
            t--;
        }
        for (int i = temp - 1; i >= 0; i--) {
            System.out.println(b[i]);
        }
    }
}
