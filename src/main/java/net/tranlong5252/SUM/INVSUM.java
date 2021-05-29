package net.tranlong5252.SUM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class INVSUM {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        double Sn = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 1; i <= a[j]; i++) {
                Sn += 1d / (2 * i - 1);
            }
            b[j] = Sn;
            Sn = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%.5f", b[i]);
            System.out.println();
        }
    }
}