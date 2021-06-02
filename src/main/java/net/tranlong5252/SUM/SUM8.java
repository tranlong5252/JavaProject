package net.tranlong5252.SUM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUM8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= T; i++) {
            int num = Integer.parseInt(reader.readLine());
            double s = sum(1, num);
            System.out.printf("%.5f\n", s);
        }
    }

    public static double sum(int i, int n) {
        if (i == n) {
            return Math.sqrt(n);
        }
        return Math.sqrt(i + sum(i + 1, n));

    }
}