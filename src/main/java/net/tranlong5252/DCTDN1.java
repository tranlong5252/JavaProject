package net.tranlong5252;

import java.util.Arrays;
import java.util.Scanner;

class DCTDN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = sc.nextInt();
        int ans = 1;
        int[] dp = new int[n];
        Arrays.fill(dp, 0);
        for (int i = 0; i < n; ++i) {
            for (int j = i; j >= 0; j--) {
                if (a[i] > a[j])
                    dp[i] = Math.max(dp[i], dp[j]);
            }
            dp[i]++;
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}
