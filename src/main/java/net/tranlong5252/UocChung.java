package net.tranlong5252;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class UocChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n < 0) n = abs(n);
        if (n == 0) {
            System.out.println("INF");
            return;
        }
        List<Integer> num = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            if (n % i == 0) num.add(i);
        }
        for (Integer i : num) {
            System.out.print(i + " ");
        }
    }
}  