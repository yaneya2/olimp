package org.example;

import java.util.LinkedList;
import java.util.Scanner;

public class number_5 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        if (n == 1 || k ==1){
            System.out.println(-1);
        }else{
            for (int i = 1; i < k + 1; i++) {
                list.add(i);
            }
            while (k + 1 < n + 1){
                if (n - 1 == k){
                    list.addFirst(++k);
                }else{
                    list.addFirst(n + 1);
                    list.addFirst(++k);
                    n--;
                }
            }
            System.out.println(list);
        }
    }
}
