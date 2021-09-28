package com.company;

import java.lang.Math;

class Numbers
{
    // A function to print all prime factors
    // of a given number n
    public static void primeFactors(int n)
    {
        // Print the number of 2s that divide n
        while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n is odd here.
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {

            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }


        // If n is a prime number greater than 2
        if (n > 2)
            System.out.print(n);
    }
    public static void main(String[] args) {
        int n = 3480;
        System.out.println("Prime Factors of " + n + " are:- " );
        primeFactors(n);
    }
}
