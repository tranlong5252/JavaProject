package net.tranlong5252.FH;

import java.util.Scanner;

//STRONG
public class FH_04_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), dem = 0;
        for (int i = a; i <= b; i++) {
            int k = i, sum = 0;
            while (k > 0) {
                sum += factorial(k % 10);
                k /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
                dem++;
            }
        }
        if (dem == 0) {
            System.out.print(0);
        }
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}