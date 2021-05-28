package net.tranlong5252;

import java.util.Scanner;

public class DEMTU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int dem = 0;
        if (!sc.hasNext()) {
            System.out.println(dem);
            return;
        }
        s = sc.nextLine();
        if (s.charAt(0) != ' ') {
            dem = 1;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                dem++;
            }
        }
        System.out.print(dem);
    }
}
