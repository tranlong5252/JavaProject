package net.tranlong5252.FH;
//SODEP (THUANNGHICH)

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FH_04_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = a; i < b; i++) {
            String s = String.valueOf(i);
            if (isThuanNghich(i) && flus(i) == 8 && s.contains("6")) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isThuanNghich(int n) {
        List<Integer> listNum = new ArrayList<>();
        // phân tích số n thành các chữ số và lưu vào listNumbers
        do {
            listNum.add(n % 10);
            n = n / 10;
        } while (n > 0);
        // kiểm tra tính thuận nghịch
        int size = listNum.size();
        for (int i = 0; i < (size / 2); i++) {
            if (!listNum.get(i).equals(listNum.get(size - i - 1))) {
                return false;
            }
        }
        return true;
    }

    static int flus(int n) {
        int s = 0;
        while (n != 0) {
            int sotachra = n % 10;
            s += sotachra;
            n /= 10;
        }
        return s;
    }
}