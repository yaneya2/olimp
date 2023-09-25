package org.example;

import java.util.Scanner;

public class number_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long count_q = scanner.nextLong();

        int cnt = 0;

        int current_k = 1;

        while (count_q >= 0){
            count_q -= (long) current_k * current_k;
            current_k++;
            cnt++;
        }
        System.out.println(cnt - 1);
    }
}
