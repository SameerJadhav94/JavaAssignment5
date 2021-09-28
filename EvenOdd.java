package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(num + " Is An Even Number.");
        }
        else{
            System.out.println(num + " Is An Odd Number.");
        }
    }
}
