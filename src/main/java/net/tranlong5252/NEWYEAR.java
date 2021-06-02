package net.tranlong5252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class NEWYEAR {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        HashMap<String, String> cau = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String s = reader.readLine();
            cau.put(s, s);
        }
        for (int i = 1; i <= n; i++) {
            cau.remove(null);
        }
        System.out.println(cau.size());
    }
}