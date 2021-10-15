package com.pb.titova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("input number");
        x = in.nextInt();
        if (x >= 0 && x <= 14){
            System.out.println("Your number " + x + " is in interval from 0 to 14");
        }
        else if (x > 14 && x <= 35){
            System.out.println("Your number " + x + " is in interval from 14 to 35");
        }
        else if (x > 35 && x <= 50){
            System.out.println("Your number " + x + " is in interval from 35 to 50");
        }
        else if (x > 50 && x <= 100){
            System.out.println("Your number " + x + " is in interval from 50 to 100");
        }
        else {
            System.out.println("Your number " + x + " is not in any interval");
        }
    }
}
