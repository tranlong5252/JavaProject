package net.tranlong5252;

import java.util.ArrayList;
import java.util.Scanner;

public class SPACE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        ArrayList<String> ar = new ArrayList<>();
        for (int T = 0; T < length; T++) {
            String s = sc.nextLine().replaceFirst("\\s++$", "");
            ar.add(s);
        }
        System.out.println(ar);
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < ar.get(i).length(); j++) {
                if (ar.get(i).charAt(j) == ' ') {
                    if (ar.get(i).charAt(j + 1) != ' ' && j > 0 && ar.get(i).charAt(j - 1) != ' ') {
                        count++;
                    } else if (ar.get(i).charAt(j + 1) != ' ') {
                        count++;
                    }
                }
            }
            if (ar.get(i).isEmpty()) System.out.println(1);
            else System.out.println(count);
        }
    }
}