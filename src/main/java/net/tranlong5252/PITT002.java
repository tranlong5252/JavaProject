package net.tranlong5252;

import java.util.Scanner;

public class PITT002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println(determinant(A, 3));
    }

    public static int determinant(int[][] arr, int n) {
        if (n == 1) return arr[0][0];
        if (n == 2) return arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
        int d = 0, sign = -1;
        for (int skipCol = 0; skipCol < n; ++skipCol) {
            int[][] matrix = new int[n - 1][n - 1];
            for (int row = 0; row < n - 1; ++row) {
                int matrixCol = 0;
                for (int col = 0; col < n; ++col)
                    if (col != skipCol) matrix[row][matrixCol++] = arr[row + 1][col];
            }
            d += (sign *= -1) * arr[0][skipCol] * determinant(matrix, n - 1);
        }
        return d;
    }
}