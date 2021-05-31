package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_04_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (validtaeString(s)) System.out.println(1);
        else System.out.println(0);
    }

    public static boolean validtaeString(String str) {
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if ((ch != '0' && ch != '6' && ch != '8')) {
                return false;
            }
        }
        return true;
    }
}