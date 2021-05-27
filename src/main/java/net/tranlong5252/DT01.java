package net.tranlong5252;

import java.util.Scanner;

public class DT01 {
    /**
     * @param a Chiều dài cạnh tam giác vuông cân = bán kính hình tròn <br>
     * @see <a href="https://luyencode.net/public/upload/8728c8cec1.jpg">hình</a>
     */
    public static double triangle(int a) {
        return a * a / 2.000;
    }

    public static double circle(int a) {
        return Math.PI * a * a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        double S = (circle(a) - 4 * triangle(a)) / 2 + 2 * triangle(a);
        System.out.printf("%.3f", S);
    }
}