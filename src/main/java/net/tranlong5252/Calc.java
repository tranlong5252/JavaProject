package net.tranlong5252;

import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        char op = in.next().charAt(0);
        float b = in.nextFloat();

        switch (op) {
            case '+':
                float add = a + b;
                System.out.printf("%.2f", add);
                break;
            case '-':
                float sub = a - b;
                System.out.printf("%.2f", sub);
                break;
            case '*':
                float mul = a * b;
                System.out.printf("%.2f", mul);
                break;
            case '/':
                float div = a / b;
                if (b == 0) {
                    System.out.println("Math Error");
                    return;
                }
                System.out.printf("%.2f", div);

        }
    }
}

