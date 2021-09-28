package com.company;

import java.util.Random;

public class FlipACoin {

    public static void main(String[] args) {
        Random Rand = new Random();
        int Heads = 0;
        int Tails = 1;
        double headcounter = 0;
        double tailcounter = 0;

        for (int i = 1; i<=20; i++){
            int flip = Rand.nextInt(2);
            if(flip == Heads){
                headcounter+=1;
            }
            else {
                tailcounter+=1;
            }

        }
        System.out.println("Ocurrence of Heads: " + (headcounter/20)*100 + "%");
        System.out.println("Ocurrence of Tails: " + (tailcounter/20)*100 + "%");
//


    }
}
