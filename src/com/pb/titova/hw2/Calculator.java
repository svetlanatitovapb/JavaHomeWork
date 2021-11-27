package com.pb.titova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operand1, operand2;
        System.out.println("input first number");
        operand1 = in.nextInt();
        System.out.println("input second number");
        operand2 = in.nextInt();
        System.out.println("input operation symbol");
        String sign = in.next();
        if (sign.equals("+")){
            System.out.println(operand1+operand2);
        }
        else if (sign.equals("-")){
            System.out.println(operand1-operand2);
        }
        else if (sign.equals("*")){
            System.out.println(operand1*operand2);
        }
        else if (sign.equals("/") && operand2 != 0){
            System.out.println(operand1/operand2);
        }
        else {
            System.out.println("invalid operation");
        }
    }
}


// Создайте класс Calculator в пакете hw2.
//Создайте две целочисленных переменные с именами operand1 и operand2.
//Предложите ввести значения operand1 и operand2 пользователю.
//Также предложите пользователю ввести знак арифметической операции и поместите его в строковую переменную sign.
//Пусть калькулятор может только складывать, отнимать, умножать и делить.
//Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
//Выведите на экран результат выполнения арифметической операции.
//В случае использования операции деления, организуйте проверку попытки деления на ноль. И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке пользователя.
