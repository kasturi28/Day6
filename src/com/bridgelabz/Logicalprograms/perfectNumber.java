package com.bridgelabz.Logicalprograms;

import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {
        long sum = 0;
        int i = 1;
        System.out.println("Please enter the number....");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        while (i <= n/2) {

            if (n%i == 0) {
                sum = sum + i;
            }
            i++;
            }
        if (sum == n) {

            System.out.println("The given number is a perfect number....");

        } else {

            System.out.println("The given number is not a perfect number....");
        }




    }

    }
