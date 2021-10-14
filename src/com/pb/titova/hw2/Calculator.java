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
