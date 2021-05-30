package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_19_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), is = sc.nextLine();
        char[] a = new char[s.length()];
        int c = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            a[c] = s.charAt(i);
            c++;
        }
        String invs = String.valueOf(a);
        if (is.equals(invs)) System.out.println("YES");
        else System.out.println("NO");
    }
}