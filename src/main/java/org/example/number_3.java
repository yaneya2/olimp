package org.example;

import java.util.Scanner;

public class number_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = scanner.nextInt();

        int b = scanner.nextInt();
        
        int ost = 1000;
        int count_And = 0;
        int count_Any = 0;

        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                int s = (i + j) % n;
                if (i + j < n) continue;
                if (s < ost) {
                    count_And = j;
                    count_Any = i;
                    ost = s;
                } else if (s == ost && j > count_And && i > count_Any) {
                    count_And = j;
                    count_Any = i;
                }else if (s == ost && j > count_And) {
                    count_And = j;
                } else if (s == ost && count_And == j && i > count_Any) {
                    count_Any = i;
                }
            }
        }
        System.out.println(count_And + " " + count_Any);
    }
}
