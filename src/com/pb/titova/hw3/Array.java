package com.pb.titova.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Input ten whole numbers:");
        for (int i = 0; i < array.length; i++ ){
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }
        int summa = 0;
        for (int i =0; i < array.length; i++ ){
            summa += array[i];
        }
        System.out.println("Sum: "+ summa);
        int colo =0;
        for (int i = 0; i < array.length; i++ ){
            if (array[i]>=0){
                colo++;
            }
        }
        System.out.println("amount of positive numbers: "+colo );
        for (int i =0; i < array.length-1; i++){
            for (int j =0; j < array.length-1; j++){
               if (array[j]>array[j+1]){
                   int left = array[j];
                   array[j] = array[j+1];
                   array[j+1] = left;
               }
            }

        }
        for (int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }

    }

}

// Создайте класс Array в пакете hw3.Программа должна позволить пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
//Вывести на экран введенный массив.
//Подсчитать сумму всех элементов массива и вывести ее на экран.
//Подсчитать и вывести на экран количество положительных элементов.
//Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)
//Вывести на экран отсортированный массив.

