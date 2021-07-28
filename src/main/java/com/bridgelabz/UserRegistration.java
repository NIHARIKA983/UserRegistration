package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String NamePattern = "^[A-Z]{1}[a-z]{3,}$";
    String EmailPattern = "^[a-z][0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    String MobilePattern = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
    String PassWordPattern = "^[a-z0-9]{8,}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NamePattern);
        Matcher matcher = pattern.matcher(fname);
        return matcher.find();
    }

    public boolean validateEmailAddress(String email){
        Pattern pattern = Pattern.compile(EmailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public boolean MobilePattern(String mobile) {
        Pattern pattern = Pattern.compile(MobilePattern);
        Matcher matcher = pattern.matcher(mobile);
        return matcher.find();
    }
    public boolean PassWordPattern(String password) {
        Pattern pattern = Pattern.compile(PassWordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}
