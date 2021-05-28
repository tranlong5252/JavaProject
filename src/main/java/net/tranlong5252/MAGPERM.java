package net.tranlong5252;

import java.util.Arrays;
import java.util.Scanner;

class MAGPERM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        Arrays.fill(a, -1);
        for (int i = 0; i < n; ++i) {
            if (i - k >= 0 && a[i - k] == -1)
                a[i - k] = i;
            else if (i + k < n && a[i + k] == -1)
                a[i + k] = i;
            else {
                System.out.println(-1);
                return;
            }
        }
        for (int c : a) {
            System.out.print(c + 1 + " ");
        }
        System.out.println();
    }
}
