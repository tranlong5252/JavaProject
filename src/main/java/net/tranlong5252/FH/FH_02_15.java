package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_02_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = new char[s.length()];
        int chan = 0, le = 0;
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for (char c : ch) {
            if (Character.getNumericValue(c) % 2 == 0) chan++;
            else le++;
        }
        System.out.println(chan + " " + le);
    }
}