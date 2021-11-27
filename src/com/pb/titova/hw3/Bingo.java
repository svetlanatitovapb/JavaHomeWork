package com.pb.titova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int x = 0;
        int InputNumber = 0;
        int RandomNumber = random.nextInt(101);
        System.out.println("Guess the number from 0 to 100 (to quit type 101): ");
        do {
            InputNumber = in.nextInt();
            x++;
            if (InputNumber == RandomNumber) {
                System.out.println("Bingoooooo!!!!");
                break;
            }
            else if (InputNumber ==101){
                System.out.println("You gave up");
                x--;
                break;
            }
            else {
                System.out.println("Wrong");
                if (InputNumber > RandomNumber) {
                    System.out.println("Your number is too big");
                    System.out.println("Try again: ");
                } else {
                    System.out.println("Your number is too small");
                    System.out.println("Try again: ");
                }
            }
        } while (InputNumber !=101);
        System.out.println("Try count: " + x );
    }
}


// 1. Написать программу игру “Bingo”.
//Создайте класс Bingo в пакете hw3.
//Программа должна загадать целое число в диапазоне от 0 до 100 и предложить пользователю его отгадать.
//При вводе числа пользователем, программа проверяет на соответствие с загаданным число и если числа совпали вывести сообщение о том, что число отгадано.
//Если числа не совпали, тогда следует вывести надпись о том, что задуманное число является больше или меньше вводимого.
//Также программа ведет подсчет попыток, и выводит это количество после того как число угадали.
//Предусмотреть возможность досрочного завершения программы, в случае если пользователь не желает продолжать угадывать число.