package net.tranlong5252.FH;
//PHANTICHTHUASONGTO

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FH_05_05 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Integer> listNumbers = phanTichSoNguyen(n);
        int size = listNumbers.size();
        size = removeDuplicateElements(listNumbers, size);
        for (int i = 0; i < size - 1; i++) {
            System.out.print(listNumbers.get(i) + " ");
        }
        System.out.print(listNumbers.get(size - 1));
    }

    public static List<Integer> phanTichSoNguyen(int n) {
        int i = 2;
        List<Integer> listNumbers = new ArrayList<>();
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                listNumbers.add(i);
            } else {
                i++;
            }
        }
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }

    public static int removeDuplicateElements(List<Integer> arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (!arr.get(i).equals(arr.get(i + 1))) {
                arr.set(j++, arr.get(i));
            }
        }
        arr.set(j++, arr.get(n - 1));
        return j;
    }
}