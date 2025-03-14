package com.lab2;

// public class Exemplu2 {
//     public static void main(String[] args){
//         System.out.println("Exemplu2");
//     }
// }



//avem 2 clase, din care doar prima are atribute





class Tank {
    int level;
   }
   public class Assignment {
    public static void main(String[] args) {
    //initializere <=> echivalent cu Tank t1=0 (in c)
    //cu new tank alocam memorie
    Tank t1 = new Tank(); //obiectul t1 din clasa Tank
    Tank t2 = new Tank(); //obiectul t2 din clasa Tank
    t1.level = 9; t2.level = 47;
    //t1.level:9, t2.level:47
    System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
    //referinta catre t1 va pointa catre obiectul t2
    t1 = t2;
    System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
    //t1.level = 27 va schimba valoarea level din t2 - atribuirea de mai sus
    t1.level = 27;
    //observam ca t1.level si t2.level au aceiasi valoare
    System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
    }
   }




   