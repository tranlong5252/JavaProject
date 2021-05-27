package net.tranlong5252;

import java.util.Scanner;

class DUYNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while (sc.hasNext()) {
            s = sc.next();
            if (s.charAt(0) == s.charAt(s.length() - 1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}