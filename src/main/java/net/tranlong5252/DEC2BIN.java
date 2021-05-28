package net.tranlong5252;

import java.util.Scanner;

public class DEC2BIN {
    static void DectoBin(long n) {
        if (n != 0) {
            DectoBin(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] arr = new long[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextLong();
        }
        for (int i = 0; i < T; i++) {
            DectoBin(arr[i]);
            System.out.println();
        }
    }
}
