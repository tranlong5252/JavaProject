package net.tranlong5252.VT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VT16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            int n;
            do {
                n = sc.nextInt();
                arr.add(n);
            } while (Math.abs(n) > 1000);
            if (arr.get(i) == 0) break;
        }
        int check = 0;
        for (Integer integer : arr) {
            if (integer < 0) {
                check++;
                System.out.print(integer + " ");
            }
        }
        if (check == 0) {
            System.out.println("NOT FOUND");
        }
    }
}