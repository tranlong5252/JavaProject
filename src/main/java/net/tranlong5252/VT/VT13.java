package net.tranlong5252.VT;

import java.util.Scanner;

public class VT13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0] + arr[n - 1],
                p1 = arr[n - 1],
                p2 = arr[0];
        for (int i = 0; i < n - 1; i++) {
            int max1 = arr[i] + arr[i + 1];
            if (max <= max1) {
                max = max1;
                p1 = arr[i];
                p2 = arr[i + 1];
            }
        }
        System.out.println(p1 + " " + p2);
    }
}