package net.tranlong5252.SUM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUM7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= T; i++) {
            int num = Integer.parseInt(reader.readLine());
            double s = sum(num);
            System.out.printf("%.5f\n", s);
        }
    }

    static double sum(int n) {
        int i;
        double S;
        i = 1;
        S = 0;
        while (i <= n) {
            S = Math.sqrt(i + S);
            i++;
        }
        return S;
    }
}