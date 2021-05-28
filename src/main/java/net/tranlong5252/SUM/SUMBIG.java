package net.tranlong5252.SUM;

import java.math.BigInteger;
import java.util.Scanner;

public class SUMBIG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger(),
                m = sc.nextBigInteger();
        System.out.println(m.add(n));
    }
}
