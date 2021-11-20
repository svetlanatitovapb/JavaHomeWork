package com.pb.titova.hw8;

import java.util.regex.Pattern;

public class Auth {
    String login = "";
    String password = "";



    public void signUp(String login, String password, String confirmPassword)
        throws WrongLoginException, WrongPasswordException,WrongConfirmPasswordException {
            char septext1[] = login.toCharArray();
            if (!login.matches("[a-zA-Z_0-9]")||septext1.length<5 || septext1.length>20) {

            }else throw new WrongLoginException();
        char septext2[] = password.toCharArray();
        if (!password.matches("[a-zA-Z_0-9_]")||septext2.length<5) {

        }else throw new WrongPasswordException();
        if (password != confirmPassword ) {

        }else throw new WrongConfirmPasswordException();
        }
    public void signIn(String login, String password)
        throws WrongLoginException{
        try {
            if (login != this.login|| password != this.password) {

            }else throw new WrongLoginException();
        } finally {

        }
}

}


