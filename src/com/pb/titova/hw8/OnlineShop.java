package com.pb.titova.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth shop = new Auth();
        String login = "";
        String password = "";
        String passwordCheck= "";

        Scanner in = new Scanner(System.in);
        System.out.println("let`s register");


        System.out.println("input new name: ");
        login = in.nextLine();

        System.out.println("input new password: ");
        password = in.nextLine();
        System.out.println("repeat password: ");
        passwordCheck = in.nextLine();

        try {
            shop.signUp (login, password, passwordCheck);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        } catch (WrongConfirmPasswordException e) {
            e.printStackTrace();
        }
        System.out.println("sign into your account ");

        System.out.println("input name: ");
        login = in.nextLine();

        System.out.println("input password: ");
        password = in.nextLine();
boolean err=false;
        try {
            shop.signIn(login, password);
        } catch (WrongLoginException e) {
            e.printStackTrace();
            err=true;
        }
        if (err == false ){
            System.out.println("YAY you are in!!! ");
        }

    }
}

// Создать пакет hw8.
//Создать класс Auth, который содержит поля login и password и методы:
//
//- signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
//Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен содержать только латинские буквы и цифры. Если логин не соответствует требованиям нужно выбросить WrongLoginException.
//Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак подчеркивания. Также password и confirmPassword должны совпадать. Если password не соответствует требованиям нужно выбросить WrongPasswordException.
//Если проверки все пройдены успешно записать в свои поля значение login и password. Так сохраняем пользователя :)
//
//- signIn (вход на сайт) принимающий login и password.
//Проверяет что login и password соответствуют значениям из полей класса.
//Если нет - выбрасывает исключение WrongLoginException.
//
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение и передает его в конструктор класса Exception.
//
//Создать класс OnlineShop с методом main.
//В main создать один объект класса Auth.
//Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
//Обработать исключения методов signUp signIn с помощью блоков try-catch.
