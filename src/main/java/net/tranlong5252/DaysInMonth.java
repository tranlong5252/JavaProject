package net.tranlong5252;

import java.time.YearMonth;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int year = scan.nextInt();
        scan.close();

        if (month > 12 || month < 1 || year < 1 || year > 100000) {
            System.out.println("INVALID");
            return;
        }

        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println(daysInMonth);
    }
}
