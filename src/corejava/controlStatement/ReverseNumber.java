package corejava.controlStatement;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter multiple digit number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reversed=0;
        while(n>0){
            int n1=n%10;
            reversed=reversed*10+n1;
            n=n/10;

        }
        System.out.println(reversed);
    }
}
