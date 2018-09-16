package com.upgrad.ImageHoster.common;

public class Errors {
    private static Errors errors = new Errors();
    private String passwordError;
    private String usernameError;

    private Errors() {
    }

    public static Errors getInstance() {
        return errors;
    }


    public void set(String input, String message) {
        if (input.equals("username")) {

            usernameError = message;

        } else {
            passwordError = message;
        }
    }

    public String get(String input) {
        if (input.equals("username")) {
            return usernameError;

        } else {
            return passwordError;
        }

    }


}
