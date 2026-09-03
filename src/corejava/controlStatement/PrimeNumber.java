package corejava.controlStatement;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        boolean primeFLag=true;
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                primeFLag=false;
            }
        }
        if(primeFLag){
            System.out.println(n+" Is Prime Number!!");
        }else{
            System.out.println(n+" Is Not Prime Number!!");
        }

    }
}
