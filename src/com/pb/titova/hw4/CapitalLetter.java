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
 // Создайте класс CapitalLetter в пакете hw4.
//Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
//Строку должен ввести пользователь.
//Пример работы:
//Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
//Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
//При выполнении задания использовать метод(ы).