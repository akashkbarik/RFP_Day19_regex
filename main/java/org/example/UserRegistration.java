package org.example;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstname(String input) {
        String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
        Pattern regex = Pattern.compile(namePattern);
        return regex.matcher(input).matches();
    }

    public boolean lastname(String input) {
        String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
        Pattern regex = Pattern.compile(namePattern);
        return regex.matcher(input).matches();
    }

    public boolean email(String input) {
        String mailPattern="^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+
                "@([0-9a-zA-Z][-]?)+[.][a-zA-z]{2,4}([.][a-zA-z]{2,4}])?$";
        Pattern regex = Pattern.compile(mailPattern);
        return regex.matcher(input).matches();
    }

    public boolean contact(String input) {
        String contactNumPattern = "^[0-9]{2}[ ][0-9]{10}$";
        Pattern regex = Pattern.compile(contactNumPattern);
        return regex.matcher(input).matches();
    }

    public boolean password(String input) {
        String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
        Pattern regex = Pattern.compile(passwordPattern);
        return regex.matcher(input).matches();
    }
}

