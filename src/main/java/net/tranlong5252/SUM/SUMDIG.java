package net.tranlong5252.SUM;

import java.util.Scanner;

public class SUMDIG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            System.out.println(sumDigit(a));
        }
    }

    public static int sumDigit(String a) {
        char[] array = a.toCharArray();
        int sum = 0;
        for (char c : array) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}