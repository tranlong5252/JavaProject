package net.tranlong5252;

import java.util.Scanner;

public class VT09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d1 = -1;
        do {
            n = sc.nextInt();
        } while (n > Math.abs(10000));
        int[] arr = new int[n], prr = new int[10000];
        for (int i = 0; i < n; i++) {
            do {
                arr[i] = sc.nextInt();
            } while (arr[i] > Math.abs(100000000));
            int d = 0;
            for (int j = 1; j <= 100; j++) {
                if (arr[i] % j == 0) {
                    d++;
                    if (d > 2) {
                        break;
                    }
                }
            }
            if (d == 2) {
                d1++;
                prr[d1] = arr[i];
            }
        }
        int temp;
        for (int i = 0; i <= d1; i++) {
            for (int j = i + 1; j <= d1; j++) {
                if (prr[j] < prr[i]) {
                    temp = prr[i];
                    prr[i] = prr[j];
                    prr[j] = temp;
                } //sort
            }
        }
        for (int i = 0; i <= d1; i++) {
            if (i == 0) {
                System.out.printf("%d ", prr[i]);
            } else {
                if (prr[i] > prr[i - 1]) {
                    System.out.printf("%d ", prr[i]);
                }
            }
        }
    }
}