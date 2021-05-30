package net.tranlong5252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SPACE {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());
        int[] dem = new int[n];
        for (int k = 0; k < n; k++) {
            String s = rd.readLine();
            StringBuilder sb = new StringBuilder(s);
            dem[k] = 0;
            int len = sb.length();
            for (int i = 0; i < len; i++) {
                if (i > 0) {
                    if (sb.charAt(i) == ' ' && sb.charAt(i - 1) == ' ') {
                        sb.deleteCharAt(i);
                        len = sb.length();
                        i--;
                    }
                }
            }
            for (int i = 0; i < len; i++) {
                if (sb.charAt(i) == ' ') {
                    dem[k]++;
                }
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(dem[k]);
        }
    }
}