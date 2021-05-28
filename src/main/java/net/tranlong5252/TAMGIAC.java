package net.tranlong5252;

import java.util.Scanner;

class TAMGIAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (isTriangle(a, b, c)) {
            int D = a + b + c;
            double S;
            if (a == (a + b) * (a * b)) { //vuông
                S = (a * b) / 2d;
            } else {
                S = (a * h(a, b, c)) / 2;
            }
            System.out.printf("%d %.2f", D, S);
        } else {
            System.out.println("NO");
        }
    }

    static double h(int a, int b, int c) {
        double p = (a + b + c) / 2d;
        return 2 * Math.sqrt(p * (p - a) * (p - b) * (p - c)) / a;
    }

    static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
