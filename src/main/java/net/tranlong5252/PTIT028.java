package net.tranlong5252;

import java.util.Scanner;

class PTIT028 {
    public static void main(String[] args) {
        double x;
        Scanner in = new Scanner(System.in);
        do {
            x = in.nextDouble();
        } while (Math.abs(x) > 10000);
        if (x > 0) {
            int reN = (int) x;
            int reP = (int) x + 1;
            System.out.println(reN + " " + reP);
        }
        if (x < 0) {
            int reN = (int) x - 1;
            int reP = (int) x;
            System.out.println(reN + " " + reP);
        }
    }
}
