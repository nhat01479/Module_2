package org.example;

public class IllegalTriangleException extends Exception {
    private String message;


    public IllegalTriangleException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
