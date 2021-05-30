package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_01_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sum(n));

    }

    static int sum(int n) {
        int s = 0, sum = 1, finalsum = 0;
        int[] a = new int[n];
        while (s < n) {
            a[s] = sum;
            s++;
            sum += 3;
        }
        for (int j : a) {
            finalsum += j;
        }
        return finalsum;
    }
}
