package com.company;

import java.util.Scanner;
class mathematics{

    void LargestNumber(int a, int b, int c){
        int d = Math.max(a,b);
        int e = Math.max(d,c);
        System.out.println(" The Largest of Three Numbers are " + e);
    }

        }
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 1st Number ");
        int a = sc.nextInt();
        System.out.println("Enter the value of 2nd Number ");
        int b = sc.nextInt();
        System.out.println("Enter the value of 3rd Number ");
        int c = sc.nextInt();
        mathematics m = new mathematics();
        m.LargestNumber(a,b,c);


    }
}
