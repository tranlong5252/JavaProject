package net.tranlong5252;

import java.math.BigInteger;
import java.util.Scanner;

public class BIGFACTOR {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            BigInteger result = factorial(a);
            System.out.println(result);
        }
    }

    public static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}