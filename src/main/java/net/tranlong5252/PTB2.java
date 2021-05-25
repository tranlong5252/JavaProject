package net.tranlong5252;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.String.format;

class PTB2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double x1;
        double x2;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println("INF");
                else System.out.println("NO");
                return;
            }
            if (c == 0 && b != 0) {
                System.out.println("0.00");
                return;
            } else {
                x1 = (-c / b);
                String strx1 = format("%.2f", x1);
                System.out.println(strx1);
            }
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            double d1 = min(x1, x2);
            double d2 = max(x1, x2);
            String strx1 = format("%.2f", d1);
            String strx2 = format("%.2f", d2);
            System.out.println(strx1 + " " + strx2);
            return;
        }
        if (delta == 0) {
            x1 = (-b / (2 * a));
            String strx1 = format("%.2f", x1);
            System.out.println(strx1);
        } else
            System.out.println("NO");
    }
}