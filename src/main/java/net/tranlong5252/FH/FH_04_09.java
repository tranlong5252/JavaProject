package net.tranlong5252.FH;
//NHANCHUSO
import java.util.Scanner;

public class FH_04_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), rs = mulDig(a);
        System.out.println(rs);
    }

    static int mulDig(int n) {
        int s = 1;
        while (n != 0) {
            int sotachra = n % 10;
            s *= sotachra;
            n /= 10;
        }
        return s;
    }
}