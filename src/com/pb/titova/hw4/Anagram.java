package com.pb.titova.hw4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String text1 = " ";
        String text2 = " ";
        System.out.println("input first text");
        text1 = in.nextLine();
        System.out.println("input second text");
        text2 = in.nextLine();
        text1 = text1.replaceAll("[^A-Za-zа-яА-ЯёЁ]+", "");
        text2 = text2.replaceAll("[^A-Za-zа-яА-ЯёЁ]+", "");
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();
        char septext1[] = text1.toCharArray();
        char septext2[] = text2.toCharArray();
        Arrays.sort(septext1);
        Arrays.sort(septext2);
        Boolean compare = Arrays.equals(septext1, septext2);
        if (compare == true)
        {
            System.out.println("Texts are anagram");
        }
        else{
            System.out.println("Texts are not anagram");
        }
    }

}

// Создайте класс Anagram в пакете hw4.
//Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
//Обе строки вводит пользователь.
//Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
//Программа должна игнорировать пробелы и знаки препинания.
//Пример анаграмм:
//Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
//Я в мире — сирота. -> Я в Риме — Ариост.
//При выполнении задания использовать метод(ы).
