package net.tranlong5252.FH;

import java.util.Scanner;

public class Fh_02_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = new char[s.length()];
        int d = 0;
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for (char c : ch) {
            if (isPrime(Character.getNumericValue(c))) d++;
        }
        System.out.println(d);
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