package net.tranlong5252;

import java.util.Scanner;

public class LKHOANVI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = i + 1;
        }
        StringBuilder builder = new StringBuilder();
        for (Integer value : data) {
            builder.append(value);
        }
        String s = builder.toString();
        printPermutn(s, "");
    }

    static void printPermutn(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutn(ros, ans + ch + " ");
        }
    }
}