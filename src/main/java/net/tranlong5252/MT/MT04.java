package net.tranlong5252.MT;

import java.util.Scanner;

public class MT04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt(), y = sc.nextInt(), i = sc.nextInt();
        int[][] a = new int[x][y];
        nhapMang(a, x, y);
        sapXep(a, x, y, i);
        xuatMang(a, x, y);
    }

    static void sapXep(int[][] a, int m, int n, int k) {
        int TG;
        int h = k - 1;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[h][i] > a[h][j]) {
                    TG = a[h][i];
                    a[h][i] = a[h][j];
                    a[h][j] = TG;
                }
            }
        }
    }

    static void nhapMang(int[][] a, int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void xuatMang(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
