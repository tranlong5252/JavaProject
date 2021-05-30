package net.tranlong5252;

import java.util.Arrays;
import java.util.Scanner;

public class THUHOACH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; ++i)
            a[i] = sc.nextInt();
        int[][] dp = new int[n + 1][c + 1];
        FillArray(dp);
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= c; ++j) {
                if (a[i] > j)
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], a[i] + dp[i - 1][j - a[i]]);
            }
        }
        System.out.println(dp[n][c]);
    }

    public static void FillArray(int[][] SC) {
        for (int[] ints : SC) {
            Arrays.fill(ints, 0);
        }
    }
}
