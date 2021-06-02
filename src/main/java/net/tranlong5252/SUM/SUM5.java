package net.tranlong5252.SUM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SUM5 {
    // n = 1 + 1/2 + 1/3 + ... + 1/n
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        ArrayList<Double> m = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            int a = Integer.parseInt(reader.readLine());
            int j = 1;
            double S = 0;
            while (j <= a) {
                S = S + 1.0 / j;
                j++;
            }
            m.add(S);
        }
        for (Double entry : m) {
            System.out.printf("%.5f\n", entry);
        }
    }
}