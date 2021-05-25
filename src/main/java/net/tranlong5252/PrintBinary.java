package net.tranlong5252;

import java.util.Scanner;

public class PrintBinary {

    public static int input() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = Integer.parseInt(input.nextLine());
                if (n < 0 || n > 20) {
                    continue;
                }
                check = true;
            } catch (Exception e) {
                System.out.println("Integer > 0 only");
            }
        }
        return (n);
    }

    public static int convertStringBinary2DecimalNumber(String binary) {
        int n = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                n = n + 1 * (int) Math.pow(2, binary.length() - i - 1);
            } else if (binary.charAt(i) == '0') {
                n = n + 0 * (int) Math.pow(2, binary.length() - i - 1);
            }
        }
        return n;

    }

    public static void PrintBinaryN(int n) {
        StringBuilder nhiphan_min = new StringBuilder();
        StringBuilder nhiphan_max = new StringBuilder();
        for (int i = 0; i < n; i++) {
            nhiphan_min.append("0");
            nhiphan_max.append("1");
        }
        int a = convertStringBinary2DecimalNumber(nhiphan_min.toString());
        int b = convertStringBinary2DecimalNumber(nhiphan_max.toString());
        int dodai_b = Integer.toBinaryString(b).length();
        for (int i = a; i <= b; i++) {
            StringBuilder str = new StringBuilder(Integer.toBinaryString(i));
            if (str.length() < dodai_b) {
                while (str.length() < dodai_b) {
                    str.insert(0, "0");
                }
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        int n = input();
        PrintBinaryN(n);
    }

}