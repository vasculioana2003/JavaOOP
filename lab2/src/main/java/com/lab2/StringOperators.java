package com.lab2;

public class StringOperators {
    public static void main(String[] args) {
    int x = 0, y = 1, z = 2;
    String s = "x, y, z ";
    System.out.println(s + x + y + z);
    System.out.println(x + " " + s); // conversie implicita a valorii x de la tipul int la String
    s =s+ "(summed) = "; // echivalent cu s=s+"(summed)="
    System.out.println(s + (x + y + z));
    System.out.println("" + x); // Shorthand for Integer.toString()-metoda de conversie a int->String
    }
   } 