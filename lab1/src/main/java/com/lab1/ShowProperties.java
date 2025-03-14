package com.lab1;

public class ShowProperties {
    public static void printProperties() {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));  
    }
}