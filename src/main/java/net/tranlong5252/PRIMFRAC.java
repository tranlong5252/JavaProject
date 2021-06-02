package net.tranlong5252;
//PHANTICH THUASONGTO

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class PRIMFRAC {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(reader.readLine());
        TreeMap<Long, Long> m = new TreeMap<>();
        for (long i = 2; i <= N; i++) {
            long somu = 0;
            while (N % i == 0) {
                somu++;
                N /= i;
                m.put(i, somu);
            }
        }
        System.out.println(m.size());
        for (Map.Entry<Long, Long> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}