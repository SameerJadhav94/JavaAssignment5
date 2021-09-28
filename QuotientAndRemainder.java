package com.company;
import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Dividend: ");
        double dividend = sc.nextDouble();

        System.out.println("Enter the value of Divisor: ");
        double divisor = sc.nextDouble();

        //Formulas:-
        double Remainder = dividend%divisor;
        double Quotient = dividend/divisor;

        System.out.println("Quotient:- " + Quotient);
        System.out.println("Remainder:- " + Remainder);

    }
}
