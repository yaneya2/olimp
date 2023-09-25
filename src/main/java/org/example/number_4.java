package org.example;

import java.util.Scanner;

public class number_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] x_2 = (Long.toBinaryString(scanner.nextLong())).split("");
        long count_1 = scanner.nextLong();
        int count_1_current = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: x_2) {
            if (s.equals("1")){
                count_1_current++;
            }
        }
        if (count_1_current <= count_1) {
            for (int i = x_2.length - 1; i >= 0; i--) {
                if (count_1_current == count_1) {
                    break;
                }
                switch (x_2[i]) {
                    case "1": {
                        stringBuilder.append(0);
                    }
                    case "0": {
                        stringBuilder.append(1);
                        count_1_current++;
                    }
                }
            }
            while (!(count_1 == count_1_current)) {stringBuilder.append(1);count_1_current++;}
            System.out.println(Long.parseLong(stringBuilder.reverse().toString(), 2));
        }
    }
}
