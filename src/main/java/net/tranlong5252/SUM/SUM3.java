package net.tranlong5252.SUM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SUM3 {
    // n 1/(1*2) + 1/(2*3) + ... + 1/(n*(n+1))
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a;
        do {
            a = s.nextLong();
        } while (a > 1000000 || a < 1);
        double Sn = 0d;
        for (long i = 1; i <= a; i++) {
            Sn += 1d / (i * (i + 1));
        }
        DecimalFormat form = new DecimalFormat("0.00000");
        System.out.println(form.format(Sn));
    }

}