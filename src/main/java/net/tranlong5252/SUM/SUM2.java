package net.tranlong5252.SUM;

import java.util.Scanner;

public class SUM2 {
    /**
     * @param n 1^2+2^2+⋯+n^2<br>
     *          phải chuyển về long vì số lớn
     */
    public static long sum(int n) {
        long Sn = 0;
        for (int i = 1; i <= n; i++) {
            Sn += (long) i * i;
        }
        return Sn;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print(sum(a));
    }
}