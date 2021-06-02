package net.tranlong5252;

import java.util.Scanner;

public class DATE2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long sec = sc.nextLong();
        System.out.println(splitToComponentTimes(sec));
    }

    public static String splitToComponentTimes(long longVal) {
        int hours = (int) longVal / 3600;
        int remainder = (int) longVal - hours * 3600;
        int mins = remainder / 60;
        remainder = remainder - mins * 60;
        int secs = remainder;
        return String.format("%02d:%02d:%02d", hours, mins, secs);
    }
}