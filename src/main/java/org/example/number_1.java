package org.example;

import java.util.Scanner;

public class number_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] letters = {"a", "b","c", "d", "e", "f", "g", "h"};

        int position = scanner.nextInt();

        int num = position % 8 == 0 ? 8 : position % 8;

        System.out.println(letters[num - 1] + (int)Math.ceil((double)position / 8));
    }
}
