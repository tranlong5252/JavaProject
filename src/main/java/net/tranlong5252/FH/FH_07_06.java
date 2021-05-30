package net.tranlong5252.FH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FH_07_06 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            int l = n - 1;
            int temp = i + l;
            for (int j = 1; j < i; ++j) {
                System.out.print(temp + " ");
                l--;
                temp += l;
            }
            System.out.println();
        }
    }
}
