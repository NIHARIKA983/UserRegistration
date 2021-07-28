package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String NamePattern = "^[A-Z]{1}[a-z]{3,}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NamePattern);
        Matcher matcher = pattern.matcher(fname);
        return matcher.find();
    }
}
