package corejava.controlStatement;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //with third variable
        int t=a;
        a=b;
        b=t;
        System.out.println("With third t--->> a:"+a+", b:"+b);
        //without third variable
        a=10;
        b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Without t variable--->> a:"+a+", b:"+b);
    }
}
