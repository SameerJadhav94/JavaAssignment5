package com.company;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int [] arr = {7, 9};
        for (int element: arr) {
            System.out.println(element);
        }
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("After swapping.....");
        for (int element: arr) {
            System.out.println(element);
        }
    }
}
