package net.tranlong5252.FH;
//UOC N

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FH_04_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) num.add(i);
        }
        for (Integer i : num) {
            System.out.print(i + " ");
        }
    }
}