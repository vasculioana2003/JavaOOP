package com.lab2;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int n = scanner.nextInt();
        scanner.close();

        int a = 0, b = 1;  // Începem cu 0 și 1
        
        if (n >= 0) {
            System.out.print(a + " ");
        }
        if (n >= 1) {
            System.out.print(b + " ");
        }

        int next;
        while (true) {
            next = a + b;
            if (next > n) break;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}