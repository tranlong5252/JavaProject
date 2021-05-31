package net.tranlong5252;

import java.util.Scanner;

public class PITT002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            a[i][0] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            a[i][1] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            a[i][2] = scan.nextInt();
        }
        int det =
                ((a[0][0] * a[1][1] * a[2][2]) + (a[0][1] * a[1][2] * a[2][0]) + (a[0][2] * a[1][0] * a[2][1])) -
                        ((a[0][2] * a[1][1] * a[2][0]) + (a[0][1] * a[1][0] * a[2][2]) + (a[0][0] * a[1][2] * a[2][1]));
        System.out.println(det);
    }
}
