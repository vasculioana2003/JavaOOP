package com.lab3;

// SimpleConstructor2.java
//Constructorii pot fi cu sau fara argumente.
class Rock2 {
    Rock2(int i) { //constructor cu argumente
        System.out.println("Rock " + i + " ");
    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        Rock2 obj;
        for(int i = 0; i < 8; i++) {
            obj=new Rock2(i); //se creaza 8 obiecte din clasa Rock2
        }
        //instantierea se face cu trimiterea argumentului i - asa cum o cere constructorul Rock2
        //se vor afisa 8 mesaje - deoarece se va apela de 8 ori constructorul Rock2(int i)
    }
   } 




   