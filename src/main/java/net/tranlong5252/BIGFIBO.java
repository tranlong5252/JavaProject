package net.tranlong5252;

import java.math.BigInteger;
import java.util.Scanner;

//FIBONACCI LONG AF
public class BIGFIBO {
    static final BigInteger mod = BigInteger.valueOf(1000000007);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        BigInteger ans = fibMod(BigInteger.valueOf(num + 1));
        System.out.println(ans);
    }

    //  Use Matrix multiplication to compute Fibonacci numbers.
    private static BigInteger fibMod(BigInteger k) {
        BigInteger aRes = BigInteger.ZERO;
        BigInteger bRes = BigInteger.ONE;
        BigInteger cRes = BigInteger.ONE;
        BigInteger aBase = BigInteger.ZERO;
        BigInteger bBase = BigInteger.ONE;
        BigInteger cBase = BigInteger.ONE;
        while (k.compareTo(BigInteger.ZERO) > 0) {
            if (k.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ONE) == 0) {
                BigInteger temp1 = aRes.multiply(aBase).add(bRes.multiply(bBase)).mod(BIGFIBO.mod);
                BigInteger temp2 = aBase.multiply(bRes).add(bBase.multiply(cRes)).mod(BIGFIBO.mod);
                BigInteger temp3 = bBase.multiply(bRes).add(cBase.multiply(cRes)).mod(BIGFIBO.mod);
                aRes = temp1;
                bRes = temp2;
                cRes = temp3;
            }
            k = k.shiftRight(1);
            BigInteger temp1 = aBase.multiply(aBase).add(bBase.multiply(bBase)).mod(BIGFIBO.mod);
            BigInteger temp2 = aBase.multiply(bBase).add(bBase.multiply(cBase)).mod(BIGFIBO.mod);
            BigInteger temp3 = bBase.multiply(bBase).add(cBase.multiply(cBase)).mod(BIGFIBO.mod);
            aBase = temp1;
            bBase = temp2;
            cBase = temp3;
        }
        return aRes.mod(BIGFIBO.mod);
    }
}

