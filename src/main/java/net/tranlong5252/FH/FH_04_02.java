package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_04_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) count += j;
            }
            if (i == count) {
                System.out.print(i + " ");
            }
        }
    }
}