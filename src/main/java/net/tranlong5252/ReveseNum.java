package net.tranlong5252;

import java.util.Scanner;

public class ReveseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(in);
        sb.reverse();
        for (int i = 0; i <= in.length(); i++) {
            if (sb.charAt(0) == '0') sb.deleteCharAt(0);
            sb.trimToSize();
        }
        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, '-');
        }
        System.out.println(sb);
    }
}
