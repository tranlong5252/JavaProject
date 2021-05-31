package net.tranlong5252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Long.toHexString;

public class DEC2HEX {
    static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(rd.readLine());
        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(rd.readLine());
            String hex = toHexString(n).toUpperCase();
            System.out.println(hex);
        }
    }
}