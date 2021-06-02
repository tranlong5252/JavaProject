package net.tranlong5252.STR;

import java.util.Scanner;

public class SUBSTR {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String a = sc.next(), b = sc.next();
        int n = a.length(), m = b.length();
        StringBuilder sa = new StringBuilder(a);
        sa.insert(0, ' ');
        a = sa.toString();
        StringBuilder sb = new StringBuilder(b);
        sb.insert(0, ' ');
        b = sb.toString();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= m; ++j) {
                if (a.charAt(i) == b.charAt(j))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        System.out.println(dp[n][m]);
    }
}