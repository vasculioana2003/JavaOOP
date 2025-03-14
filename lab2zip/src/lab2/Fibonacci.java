package lab2;

import java.util.ArrayList;

public class Fibonacci {
    public void getFibOfN(int n){
        int a = 0, b = 1, c;
        System.out.print("0 1 ");
        
        while(a+b < n){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}