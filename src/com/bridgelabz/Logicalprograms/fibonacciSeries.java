package com.bridgelabz.Logicalprograms;

public class fibonacciSeries {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int n3;
        int i;
        int count = 10;

        System.out.println(" "+ n1);
        System.out.println(" "+ n2);

        for (i=1 ; i<count ; i++){

        n3 = n1 + n2;
        System.out.println(" "+ n3);
        n1=n2;
        n2=n3;
    }

    }

}
