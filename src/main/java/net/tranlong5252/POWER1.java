package net.tranlong5252;

import java.math.BigInteger;
import java.util.Scanner;

public class POWER1 {
    static Scanner sc = new Scanner(System.in);
    static final BigInteger mod = BigInteger.valueOf(1000000007);

    public static void main(String[] args) {
        BigInteger n, p;
        n = sc.nextBigInteger();
        p = sc.nextBigInteger();
        BigInteger result = n.modPow(p, mod);
        System.out.println(result);
    }
}