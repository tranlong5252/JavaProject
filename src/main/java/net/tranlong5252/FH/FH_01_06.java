package net.tranlong5252.FH;

import java.util.Scanner;

public class FH_01_06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int thang = scan.nextInt();
        long nam = scan.nextLong();

        if (thang < 1 || thang > 12) {
            System.out.println("Du lieu khong hop le");
            return;
        }
        System.out.println(fun(thang, nam));
    }

    static boolean isCheck(long nam) {
        return ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0);
    }

    static int fun(int thang, long nam) {
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isCheck(nam))
                    return 29;
                else
                    return 28;
            default:
                System.out.println("Du lieu khong hop le");
        }
        return 0;
    }
}
