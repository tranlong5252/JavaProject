package net.tranlong5252.STR;

import java.util.Arrays;
import java.util.Scanner;

public class STR04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        demsokitu(s);
    }

    static void demsokitu(String S) {
        int t = S.length();
        char[] tempArray = S.toLowerCase().toCharArray();
        Arrays.sort(tempArray);
        S = new String(tempArray);
        int[] dem = new int[10000];
        for (int i = 0; i < t; i++) {
            dem[i] = 0;
            for (int j = 0; j < t; j++)
                if (S.charAt(i) - '0' == S.charAt(j) - '0') dem[i]++;
        }
        for (int i = 0; i < t; i += dem[i])
            if ((S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') || (S.charAt(i) >= '0' && S.charAt(i) <= '9') || S.charAt(i) >= 'a' && (S.charAt(i) <= 'z'))
                System.out.printf("%c %d\n", S.charAt(i), dem[i]);
    }
}