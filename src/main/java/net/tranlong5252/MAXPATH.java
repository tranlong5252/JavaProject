package net.tranlong5252;

import java.util.Scanner;

public class MAXPATH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] a = new int[m + 2][n + 2];
        for (int i = 0; i <= n; ++i)
            a[0][i] = a[m + 1][i] = Integer.MIN_VALUE;
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) a[i][j] = sc.nextInt();
        }
        for (int j = 2; j <= n; ++j) {
            for (int i = 1; i <= m; ++i) {
                a[i][j] += Math.max(a[i + 1][j - 1], Math.max(a[i][j - 1], a[i - 1][j - 1]));
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i <= m; ++i) {
            ans = Math.max(ans, a[i][n]);
        }
        System.out.println(ans);
    }
}