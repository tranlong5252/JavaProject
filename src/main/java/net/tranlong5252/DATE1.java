package net.tranlong5252;

import java.util.Scanner;

public class DATE1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int ngay = reader.nextInt(), nam = reader.nextInt();
        int i = 1, tam = 1, thang = 1;
        if ((nam % 400 == 0) || (nam % 100 != 0 && nam % 4 == 0)) {
            while (tam <= ngay) {
                if (i == 31) {
                    if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
                        thang++;
                        i = 0;
                    }
                } else if (i == 30) {
                    if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                        thang++;
                        i = 0;
                    }
                } else if (i == 29 && thang == 2) {
                    thang++;
                    i = 0;
                }
                i++;
                tam++;
            }
        } else {
            while (tam <= ngay) {
                if (i == 31) {
                    if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
                        thang++;
                        i = 0;
                    }
                } else if (i == 30) {
                    if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                        thang++;
                        i = 0;
                    }

                } else if (i == 28 && thang == 2) {
                    thang++;
                    i = 0;
                }
                i++;
                tam++;
            }
        }
        System.out.println(i - 1 + " " + thang);
    }
}