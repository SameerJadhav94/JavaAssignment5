package com.company;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n: ");
        int n = sc.nextInt();
        double Harmonic = 0;
        for (double i=1; i<=n; i++){
            Harmonic+= 1/i;
        }
        System.out.println("The value of " + n + "th Hamronic Number is:- " + Harmonic);
        


        }



    }

