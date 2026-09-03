package corejava.controlStatement;

import java.util.Scanner;

public class FactorialRecursion {
    static int fact=1;
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FactorialRecursion fr=new FactorialRecursion();
        fr.factorial(n);

        System.out.println("Factorial of "+n+"="+fact);
    }
    void factorial(int n){
        if(n>1){
            fact=fact*n;
            factorial(n-1);
        }
    }
}
