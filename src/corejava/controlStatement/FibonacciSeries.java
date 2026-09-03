package corejava.controlStatement;

import java.util.Scanner;

public class FibonacciSeries {
    int fibonacciNumber=0;

    int a=0;
    int b=1;
    static String fibonacci="0,1";
    public static void main(String[] args) {
        System.out.println("Enter the number of fibonacci series");
        Scanner sc = new Scanner(System.in);
        int totalNumber=sc.nextInt();
        FibonacciSeries  f=new FibonacciSeries();
        f.recusMethod(totalNumber-2);
        System.out.println(fibonacci);
    }
    void recusMethod(int totalNumber){
        if(totalNumber>=1) {
            fibonacciNumber = a + b;
            if (fibonacci == "") {
                fibonacci = fibonacciNumber + "";
            } else {
                fibonacci = fibonacci + "," + fibonacciNumber;
            }

            a = b;
            b = fibonacciNumber;
            recusMethod(totalNumber-1);
        }
    }
}
