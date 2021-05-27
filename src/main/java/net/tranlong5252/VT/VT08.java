package net.tranlong5252.VT;

import java.util.ArrayList;
import java.util.Scanner;

public class VT08 {
    public static void main(String[] args) {
        int length;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            int x;
            x = sc.nextInt();
            arr.add(x);
        }
        if (length == 1) {
            System.out.print(arr.get(0));
            System.out.print(" ");
        } else {
            for (int i = 0; i < length; i++) {
                if (i % 2 != 0) {
                    if (i == length - 1) {
                        System.out.print(arr.get(i) + (Math.abs(arr.get(i - 1))));
                        System.out.print(" ");
                    } else {
                        if (arr.get(i - 1) > arr.get(i + 1)) {
                            System.out.print(arr.get(i) + (arr.get(i - 1) - arr.get(i + 1)));
                            System.out.print(" ");
                        } else {
                            System.out.print(arr.get(i) + (arr.get(i + 1) - arr.get(i - 1)));
                            System.out.print(" ");
                        }
                    }
                } else {
                    System.out.print(arr.get(i));
                    System.out.print(" ");
                }
            }
        }
    }
}
