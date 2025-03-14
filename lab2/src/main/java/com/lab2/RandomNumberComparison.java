package com.lab2;

import java.util.Random;

// public class RandomNumberComparison {
//     public static void main(String[] args) {
//         Random random = new Random();
//         int[] numbers = new int[25];
        
//         // Generăm 25 de numere aleatoare între 1 și 100
//         for (int i = 0; i < 25; i++) {
//             numbers[i] = random.nextInt(100) + 1; \\pt fiecare elem din vector genereaza un numar random cuprins intre 0 si 100-deoarece facem +1
//         }
        
//         // Comparăm fiecare număr cu următorul
//         for (int i = 0; i < 24; i++) {
//             System.out.print("Număr: " + numbers[i] + " comparat cu " + numbers[i + 1] + " → ");
            
//             if (numbers[i] > numbers[i + 1]) {
//                 System.out.println("Mai mare");
//             } else if (numbers[i] < numbers[i + 1]) {
//                 System.out.println("Mai mic");
//             } else {
//                 System.out.println("Egal");
//             }
//         }
//     }
// }


public class RandomNumberComparison{
    public static void main(String[]args){
        Random random=new Random();
        int[] numbers=new int[25];

        for (int i=0;i<25;i++){
            numbers[i]=random.nextInt(100)+1;
        }

        for (int i=0;i<24;i++){
            System.out.print("numar:" + numbers[i] + " comparat cu " + numbers [i+1] + "->");

            if(numbers[i]>numbers[i+1]){
                System.err.println("mai mare");
            } else if (numbers[i]<numbers[i+1]){
                System.err.println("mai mic");
            } else {
                System.err.println("egal");
            }

        }

    }
}