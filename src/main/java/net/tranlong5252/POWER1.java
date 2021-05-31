package net.tranlong5252;

import java.math.BigInteger;
import java.util.Scanner;

public class POWER1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong(), p = sc.nextLong();
        BigInteger r = pow(n, p), s = BigInteger.valueOf(1000000007), finals = r.mod(s);
        System.out.println(finals);
    }

    static BigInteger sqr(BigInteger x) {
        return x.multiply(x);
    }

    static BigInteger pow(long a, long b) {
        BigInteger x;
        if (b == 0) return BigInteger.ONE;
        if (b == 1) return BigInteger.valueOf(a);
        else
            x = pow(a, b / 2);
        if (b % 2 == 0)
            return sqr(x);
        else
            return sqr(x).multiply(BigInteger.valueOf(a));
    }
}