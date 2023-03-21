package org.example;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean checkFirstname(String input) {
        String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
        Pattern regex = Pattern.compile(namePattern);
        boolean result= regex.matcher(input).matches();
        if(!result){
            throw new UserInputException("invalid firstname");
        }
        return result;
    }

    public boolean checkLastname(String input) {
        String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
        Pattern regex = Pattern.compile(namePattern);
        if (! regex.matcher(input).matches()){
            throw new UserInputException("invalid lastname");
        }
        return regex.matcher(input).matches();
    }

    public boolean checkEmail(String input)  {
        String mailPattern="^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+
                "@([0-9a-zA-Z][-]?)+[.][a-zA-z]{2,4}([.][a-zA-z]{2,4}])?$";
        Pattern regex = Pattern.compile(mailPattern);
        if (! regex.matcher(input).matches()){
            throw new UserInputException("invalid email");
        }
        return regex.matcher(input).matches();
    }

    public boolean checkContact(String input)  {
        String contactNumPattern = "^[0-9]{2}[ ][0-9]{10}$";
        Pattern regex = Pattern.compile(contactNumPattern);
        if (! regex.matcher(input).matches()){
            throw new UserInputException("invalid contact");
        }
        return regex.matcher(input).matches();
    }

    public boolean checkPassword(String input) {
        String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
        Pattern regex = Pattern.compile(passwordPattern);
        if (! regex.matcher(input).matches()){
            throw new UserInputException("invalid password");
        }

        return regex.matcher(input).matches();
    }
}

