package com.lab2;
import java.util.*;

public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47); //seed da o valoare de la care incepe programul sa genereze nr random
        float f[] = new float[10]; // crearea arrayului de numere reale (array ul incepe tot de la 0--->9)
        for(int i = 0; i < 10; i++)
            f[i] = rand.nextFloat(); // initializarea fiecarui element din array - parcurgere

        
        for(float x : f) //parcurgere vector f element cu element //val curenta este x(ii float pentru ca elem din array sunt float), f este dimensiunea array ului
            System.out.println(x); //x va merge de la f[0] pana la f[f.length-1]
        /* echivalent cu: 
        for(int k=0;k<10;k++){
            x=f[k];
            System.out.println(x);
        }
        */
    }
} 