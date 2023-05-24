package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidate {
    private static  String REGEX;
    public static boolean validateEmail(String str){
        REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
