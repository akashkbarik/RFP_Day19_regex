package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public void firstname() {
        String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
        Pattern regex = Pattern.compile(namePattern);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last name : ");
        String inputStr = sc.nextLine();
        Matcher firstNameMatcher = regex.matcher(inputStr);
        sc.close();
        if (firstNameMatcher.matches()) {
            System.out.println(inputStr + " is valid name.");
        } else {
            System.out.println(inputStr + " is invalid name.Kindly input the right one.");
        }
    }

    public void lastname() {
        String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
        Pattern regex = Pattern.compile(namePattern);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last name : ");
        String inputStr = sc.nextLine();
        Matcher lastNameMatcher = regex.matcher(inputStr);
        sc.close();
        if (lastNameMatcher.matches()) {
            System.out.println(inputStr + " is valid name.");
        } else {
            System.out.println(inputStr + " is invalid name.Kindly input the right one.");
        }
    }
    public void email(){
        String mailPattern = "^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
        Pattern regex = Pattern.compile(mailPattern);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email ID : ");
        String inputStr = sc.nextLine();
        Matcher emailIDMatcher = regex.matcher(inputStr);
        sc.close();
        if (emailIDMatcher.matches()) {
            System.out.println(inputStr + " is valid mail.");
        } else {
            System.out.println(inputStr + " is invalid mail address.Kindly input the right one.");
        }
    }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstname();
        userRegistration.lastname();
        userRegistration.email();


    }
}
