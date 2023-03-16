package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public void firstname() {
        String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
        Pattern regex = Pattern.compile(namePattern);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name : ");
        String inputStr = sc.nextLine();
        Matcher firstNameMatcher = regex.matcher(inputStr);
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
        if (lastNameMatcher.matches()) {
            System.out.println(inputStr + " is valid name.");
        } else {
            System.out.println(inputStr + " is invalid name.Kindly input the right one.");
        }
    }
    public void email(){
        String mailPattern = "^([a-zA-Z0-9\\.]+)@([a-z0-9]+).([a-z]{2,8})(\\.[a-z]{2,8})?$";
        Pattern regex = Pattern.compile(mailPattern);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email ID : ");
        String inputStr = sc.nextLine();
        Matcher emailIDMatcher = regex.matcher(inputStr);
        if (emailIDMatcher.matches()) {
            System.out.println(inputStr + " is valid mail.");
        } else {
            System.out.println(inputStr + " is invalid mail address.Kindly input the right one.");
        }
    }
    public void Contact(){
        String contactNumPattern = "^[0-9]{2}[ ][0-9]{10}$";
        Pattern regex = Pattern.compile(contactNumPattern);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the contact number : ");
        String inputStr = sc.nextLine();
        Matcher contactNumMatcher = regex.matcher(inputStr);
        if (contactNumMatcher.matches()) {
            System.out.println(inputStr + " is valid contact number.");
        } else {
            System.out.println(inputStr + " is invalid contact number.Kindly input the right one.");
        }
    }
        public boolean password() {
            String passwordPattern = "^[A-Za-z]{8}$";
            Pattern regex = Pattern.compile(passwordPattern);
            Scanner sc =new Scanner(System.in);
            System.out.println("Please log in using 8 character password.");
            System.out.print("Enter the Password : ");
            String inputStr = sc.nextLine();
            Matcher passwordMatcher = regex.matcher(inputStr);
            if (passwordMatcher.matches()) {
                System.out.println(inputStr + " succesfully loggedin and passed first rule.");
            } else {
                System.out.println(inputStr + " is invalid password.Kindly input minimum 8 character.");
            }
            return false;
        }

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.firstname();
        userRegistration.lastname();
        userRegistration.email();
        userRegistration.Contact();
        userRegistration.password();

    }
}
