package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HappyTestUserInput {
    @Test
    public void givenFirstname_WhenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstname("Akash");
        assertEquals(true, result);
    }

    @Test
    public void givenLastname_WhenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastname("Barik");
        assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.email("aaka.barik@gmail.com");
        assertEquals(true, result);
    }

    @Test
    public void givenContact_WhenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.contact("91 9938633239");
        assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.password("Akashbarik12#");
        assertEquals(true, result);
    }
}
