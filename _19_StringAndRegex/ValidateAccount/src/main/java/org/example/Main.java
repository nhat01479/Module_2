package org.example;

public class Main {
    public static void main(String[] args) {

        String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
        String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

        for (String account : validAccount) {
            boolean isValid = ValidateAccount.validateAccount(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
        System.out.println("---------------------------------");
        for (String account : invalidAccount) {
            boolean isValid = ValidateAccount.validateAccount(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
    }
}