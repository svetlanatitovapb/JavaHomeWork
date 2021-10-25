package com.pb.titova.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        text();
    }
    static void text (){
        String textmessage = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Input text:");
        textmessage=in.nextLine();
        String upcase=" ";
        Scanner scaner = new Scanner(textmessage);
        while (scaner.hasNext()){
            String words = scaner.next();
            upcase += Character.toUpperCase(words.charAt(0))+words.substring(1)+" ";
        }
        System.out.println(upcase.trim());
    }
}
