package net.tranlong5252.STR;

import java.util.Scanner;

public class STR03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int n = sc.nextInt(), i = 0;
        while (i < n) {
            char a = sc.next().toLowerCase().charAt(0);
            System.out.println(findchar(s, a));
            i++;
        }
    }

    static int findchar(String s, char x) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == x) {
                count++;
            }
        }

        return count;
    }
}