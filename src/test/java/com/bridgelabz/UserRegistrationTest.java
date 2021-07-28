package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    //UC1
    @Test
    public void givenFirstName_whenValid_thenReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("Niharika");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenInValid_thenReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("niha");
        Assert.assertFalse(result);
    }
    //UC2

    @Test
    public void givenLastName_whenValid_thenReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("Gowda");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_whenInValid_thenReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("kv");
        Assert.assertFalse(result);
    }
    //UC3

    @Test
    public void giveEmail_AsTrue_When_its_Valid() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEmailAddress("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void giveEmail_AsFalse_When_its_InValid() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEmailAddress("abc");
        Assert.assertFalse(result);

    }
    //UC4

    @Test
    public void givenMobile_whenValid_thenReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.MobilePattern("9919819801");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobile_whenValid_thenReturnFalse() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.MobilePattern("647383946");
        Assert.assertFalse(result);
    }
}

