package org.example;


import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SadTestUserInput {


    @Test
    public void givenFirstname_WhenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            ExpectedException ExceptionRule = ExpectedException.none();
            ExceptionRule.expect(UserInputException.class);
            boolean result = userRegistration.checkFirstname("akh");
            assertEquals(true, result);
        } catch (UserInputException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastname_WhenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        ExpectedException ExceptionRule = ExpectedException.none();
        ExceptionRule.expect(UserInputException.class);
        try {
            boolean result = userRegistration.checkLastname("Ba");
            assertEquals(true, result);

        } catch (UserInputException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        ExpectedException ExceptionRule = ExpectedException.none();
        ExceptionRule.expect(UserInputException.class);
        try {
            boolean result = userRegistration.checkEmail("aakbarikgmai");
            assertEquals(true, result);

        } catch (UserInputException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        ExpectedException ExceptionRule = ExpectedException.none();
        ExceptionRule.expect(UserInputException.class);
        try {
            boolean result = userRegistration.checkPassword("Akashbarik12");
            assertEquals(true, result);
        } catch (UserInputException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void givenContact_WhenNotProper_ShouldreturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        ExpectedException ExceptionRule = ExpectedException.none();
        ExceptionRule.expect(UserInputException.class);
        try {
            boolean result = userRegistration.checkContact("993863");
            assertEquals(true, result);
        } catch (UserInputException e) {
            System.out.println(e.getMessage());
        }
    }
                    @Test
                    public void givenPassword_WhenNotProper_ShouldreturnTrue () {
                        UserRegistration userRegistration = new UserRegistration();
                        ExpectedException ExceptionRule = ExpectedException.none();
                        ExceptionRule.expect(UserInputException.class);
                        try {
                            boolean result = userRegistration.checkPassword("kashbarik1");
                            assertEquals(true, result);
                        } catch (UserInputException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }