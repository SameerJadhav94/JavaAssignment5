package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int input = sc.nextInt();
        if(input%4 ==0 && input%100 != 0){
            System.out.println(input + " is a Leap Year");
        }
        else{
            System.out.println(input + " is not a Leap Year");
        }

    }

}
