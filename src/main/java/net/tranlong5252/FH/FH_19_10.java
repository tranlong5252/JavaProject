package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_19_10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        int count = 0;
        if (s.startsWith("{") && s.endsWith("}")) {
            s = s.replace("{", "").replace("}", "");
            String[] sb = s.split(", ");
            for (int i = 0; i < sb.length; i++) {
                count++;
            }
            System.out.println(count);
        } else System.out.println(0);
    }
}
