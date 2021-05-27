package net.tranlong5252.VT;

import java.util.Scanner;

class VT14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0] * a[1];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (max < a[i] * a[j]) {
                    max = a[i] * a[j];
                }
            }
        }
        System.out.println(max);
    }
}