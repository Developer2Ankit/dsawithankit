package corejava.controlStatement;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Even number!");
        }else{
            System.out.println("Odd number!");
        }
    }
}
