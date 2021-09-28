package com.company;

import java.util.Objects;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        String [] vowel = {"a", "e", "i", "o", "u"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        String input = sc.nextLine();

        if (Objects.equals(input, "a") || Objects.equals(input, "e") || Objects.equals(input, "i") || Objects.equals(input, "o") || Objects.equals(input, "u")){
            System.out.println(input + " is a vowel");
        }
        else {
            System.out.println(input + " is a consonant");
        }



    }
}
