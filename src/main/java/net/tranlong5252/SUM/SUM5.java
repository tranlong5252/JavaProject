package net.tranlong5252.SUM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUM5 {
    // n = 1 + 1/2 + 1/3 + ... + 1/n
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int[] x = new int[T];
        for (int i = 0; i < T; i++) {
            x[i] = Integer.parseInt(reader.readLine());
            System.out.printf("%.5f\n", sum(x[i]));
        }
    }

    static double sum(int a) {
        double s = 0;
        for (int j = 1; j <= a; j++)
            s += 1.0 / j; //time limit
        return s;
    }
}