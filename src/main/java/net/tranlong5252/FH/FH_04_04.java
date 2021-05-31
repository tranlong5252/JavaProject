package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_04_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (isFib(flus(i)) && isPrime(i)) System.out.print(i + " ");
        }
    }

    static boolean isFib(int n) {
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 0;
        while (thirdTerm < n) {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
        return thirdTerm == n;
    }

    static int flus(int n) {
        int s = 0;
        while (n != 0) {
            int sotachra = n % 10;
            s += sotachra;
            n /= 10;
        }
        return s;
    }

    static boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if (n % 2 == 0 || (n <= 1))
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}