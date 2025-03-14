package lab2;

public class Fibonacci {
    public int getFibOfN(int n){
        if (n==0) return 0;
        else if (n==1) return 1;
        else return this.getFibOfN(n-2)+ this.getFibOfN(n-1);
    }

    // STATIC
    public static int getStaticFibOfN(int n){
        return this.getFibOfN(n);
    }
}