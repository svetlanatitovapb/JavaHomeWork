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
