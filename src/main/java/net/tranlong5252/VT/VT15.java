package net.tranlong5252.VT;

import java.util.Scanner;

public class VT15 {
    public static void input(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void sort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10000];
        int n = sc.nextInt();
        input(a, n);
        sort(a, n);
        int[] b = new int[10000]; // khai bao mang so am
        int i = 0, j = 0;
        int[] c = new int[10000]; // khai bao mang so duong
        for (int k = 0; k < n; k++) {
            if (a[k] < 0) {
                b[i] = a[k];
                i++;
            }
            if (a[k] >= 0) {
                c[j] = a[k];
                j++;
            }
        }
        int max1 = b[0] * b[1] * b[2];
        int max2 = b[0] * b[1] * c[j - 1];
        int max3 = c[j - 1] * c[j - 2] * c[j - 3];
        int max = max1;
        if (max2 > max) {
            max = max2;
        }
        if (max3 > max) {
            max = max3;
        }
        System.out.print(max);
    }

    public final static Scanner sc = new Scanner(System.in);
}