package corejava.controlStatement;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.print("Enter multiple digit number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNumber=n;
        int reversed = 0;
        while (n > 0) {
            int n1 = n % 10;
            reversed = reversed * 10 + n1;
            n = n / 10;

        }
        if(originalNumber==reversed){
            System.out.println("The number:"+originalNumber+" is a palindrome");
        }else {
            System.out.println("The number:"+originalNumber+" is not a palindrome");
        }
    }
}
