package net.tranlong5252.FH;

import java.util.Scanner;

//FIBONACCI
public class FH_04_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1, num1 = 0, num2 = 1;
        while (i <= a) {
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}