package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HappyTestUserInput {
    @Test
    public void givenFirstname_WhenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstname("Akash");
        assertEquals(true, result);
    }

    @Test
    public void givenLastname_WhenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkLastname("Barik");
        assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkEmail("aaka.barik@gmail.com");
        assertEquals(true, result);
    }

    @Test
    public void givenContact_WhenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkContact("91 9938633239");
        assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkPassword("Akashbarik12#");
        assertEquals(true, result);
    }
}
