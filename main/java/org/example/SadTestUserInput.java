package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SadTestUserInput {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstname_WhenNotProper_ShouldreturnFalse() {
        boolean result = userRegistration.firstname("akh");
        assertEquals(true, result);
    }

    @Test
    public void givenLastname_WhenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastname("Ba");
        assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.email("aakbarikgmai");
        assertEquals(true, result);

    }
    @Test
    public void givenPassword_WhenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.password("Akashbarik12");
        assertEquals(true, result);
    }

    @Test
    public void givenContact_WhenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.contact("993863");
        assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldreturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.password("kashbarik1");
        assertEquals(true, result);
    }
}