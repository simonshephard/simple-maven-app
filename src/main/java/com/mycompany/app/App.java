package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private static final String MESSAGE = "Hello World!";

    public App() {
        // this app is just a simple example so constructor is empty
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return MESSAGE;
    }

}
