package com.company;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        // Table Of 2^n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n: ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){

            System.out.println("2 to the power " + i + " = " + Math.pow(2,i));

        }

    }




}
