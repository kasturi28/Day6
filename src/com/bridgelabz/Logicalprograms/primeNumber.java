package com.bridgelabz.Logicalprograms;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        System.out.println("Please enter the number....");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = 0;
        int i = 0;
        int check = 0;
        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println("The given number is not a prime number...");
        } else {

            for (i = 2; i <= m; i++) {

                if (n % i == 0) {

                    System.out.println("The given number is not a prime number...");
                    check = 1;
                    break;
                }
            }

            if (check == 0) {
                System.out.println("The given number is a prime number...");

            }

        }
    }

}