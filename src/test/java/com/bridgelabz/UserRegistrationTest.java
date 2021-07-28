package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
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
}

