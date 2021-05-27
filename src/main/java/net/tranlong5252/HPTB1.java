package net.tranlong5252;

import java.util.Scanner;

public class HPTB1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a1 = s.nextDouble(), b1 = s.nextDouble(), c1 = s.nextDouble(),
                a2 = s.nextDouble(), b2 = s.nextDouble(), c2 = s.nextDouble();

        double S = a1 * b2 - b1 * a2,
                Sx = c1 * b2 - b1 * c2,
                Sy = a1 * c2 - c1 * a2;

        if (S == 0 && Sx == 0)
            System.out.print("VOSONGHIEM");
        if (S == 0 && Sx != 0)
            System.out.print("VONGHIEM");
        if (S != 0) {
            double o1 = Sx / S, o2 = Sy / S;
            if (o1 == 0) o1 = 0;
            if (o2 == 0) o2 = 0;
            System.out.printf("%.2f %.2f", o1, o2);
        }
    }
}