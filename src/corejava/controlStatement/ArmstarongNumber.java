package corejava.controlStatement;

import java.util.Scanner;

public class ArmstarongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        int length=String.valueOf(n).length();
        while (temp!=0){
            int rem=temp%10;
            temp=temp/10;
            int multiply=1;
            for(int i=0;i<length;i++){
                multiply=multiply*rem;
            }

            sum=sum+multiply;
        }
        if(sum==n){
            System.out.println("This is a Armstrong number "+sum);
        }else{
            System.out.println("This is not a number:"+n);
        }

    }
}
