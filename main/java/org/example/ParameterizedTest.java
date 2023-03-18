package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String emailID;
    private String password;

    private boolean expectedResultForFName;
    private boolean expectedResultForLName;
    private boolean expectedResultForNumber;
    private boolean expectedResultForEmail;
    private boolean expectedResultForPassword;




    public ParameterizedTest(String firstName, String lastName, String contactNumber, String emailID, String password,
                             boolean expectedResultForFName, boolean expectedResultForLName, boolean expectedResultForNumber,
                             boolean expectedResultForEmail, boolean expectedResultForPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.emailID = emailID;
        this.password = password;
        this.expectedResultForFName = expectedResultForFName;
        this.expectedResultForLName = expectedResultForLName;
        this.expectedResultForNumber = expectedResultForNumber;
        this.expectedResultForEmail = expectedResultForEmail;
        this.expectedResultForPassword = expectedResultForPassword;
    }

    @Parameterized.Parameters
    public static Collection Input() {
        return Arrays.asList(new Object[][]{{"", "", "", "", "", false, false, false, false, false},
                {"Akash", "Barik", "91 4178523689", "akshbarik12@gmail.com", "Akashbarik12#", true, true, true, true, true}});
    }

    @Test
    public void validateFirstName() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(expectedResultForFName, userRegistration.firstname(firstName));
    }

    @Test
    public void validateLastName() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(expectedResultForLName, userRegistration.lastname(lastName));
    }

    @Test
    public void validateContactNumber() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(expectedResultForNumber, userRegistration.contact(contactNumber));
    }

    @Test
    public void validateEmailId() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(expectedResultForEmail, userRegistration.email(emailID));
    }

    @Test
    public void validatePassword() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals(expectedResultForPassword, userRegistration.password(password));
    }
}

