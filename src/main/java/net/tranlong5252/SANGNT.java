package net.tranlong5252;

import java.util.Scanner;

class SANGNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] check = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            check[i] = true;
        }

        // Thuật toán sàng nguyên tố
        // Nếu một số là số nguyên tố, thì tất cả các bội của nó không phải số nguyên tố
        for (int i = 2; i <= N; i++) {
            if (check[i]) {
                for (int j = 2 * i; j <= N; j += i) {
                    check[j] = false;
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (check[i]) {
                System.out.print(i + " ");
            }
        }
    }
}