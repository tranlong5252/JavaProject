package net.tranlong5252;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PERFECT {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer[] ar = new Integer[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar, Collections.reverseOrder());
        int ans = ar[0] - ar[1];
        for (int i = 1; i + 1 < n; ++i) {
            ans = Math.min(ans, ar[i] - ar[i + 1]);
        }
        System.out.println(ans);
    }
}