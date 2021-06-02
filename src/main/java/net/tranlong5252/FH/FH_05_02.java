package net.tranlong5252.FH;
//ARMSTRONG NUMBERS

import java.util.Scanner;

public class FH_05_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i < n; i++) {
            if (isArmNum(i))
                System.out.print(i + " ");
        }
    }

    static boolean isArmNum(int n) {
        long originalNumber, remainder, result = 0, i = 0;
        originalNumber = n;
        for (; originalNumber != 0; originalNumber /= 10) i++;
        originalNumber = n;
        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, i);
        }
        return result == n;
    }
}