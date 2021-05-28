package net.tranlong5252.MT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MT06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        int[][] arr = new int[x][y];
        int t = x * y;
        int r = 0;
        int[] b = new int[t];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
                if (Math.sqrt(arr[i][j]) == (int) Math.sqrt(arr[i][j])) {
                    b[r] = arr[i][j];
                    r++;
                }
            }
        }
        if (r == 0) System.out.println("NOT FOUND");
        else {
            Arrays.sort(arr, Comparator.comparing(a -> a[0]));
            for (int i = 0; i < r; i++) {
                if (b[i + 1] != b[i]) System.out.print(b[i] + " ");
            }
        }
    }

    /*static void sort(int[] b, int r) {
        int temp;
        for (int i = 0; i < r - 1; i++) {
            for (int j = i + 1; j < r; j++) {
                if (b[i] > b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
    } */
}