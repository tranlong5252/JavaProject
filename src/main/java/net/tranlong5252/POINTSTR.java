package net.tranlong5252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class POINTSTR {
    static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(rd.readLine()); //really useless
        String s = rd.readLine();
        String strFind = "luyencode";
        int count = 0, fromIndex = 0;
        while ((fromIndex = s.indexOf(strFind, fromIndex)) != -1) {
            count++;
            fromIndex++;
        }
        System.out.println(count);
    }
}