package leet.code;

import java.util.Scanner;

public class ZigZack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        String str = "PAYPALISHIRING";//sc.nextLine();
         String finalString="";
        String[] rows = new String[numRows];
        int count=0;
        for (int i = 0; i < rows.length; i++) {
            rows[i] = "";
        }
        while (count < str.length()) {

            // DOWN
            for (int i = 0; i < rows.length; i++) {

                if (count < str.length()) {
                    rows[i] += str.charAt(count);
                    count++;
                }
            }

            // UP
            for (int j = rows.length - 2; j > 0; j--) {

                if (count < str.length()) {
                    rows[j] += str.charAt(count);
                    count++;
                }
            }
        }
        for(int i=0;i<rows.length;i++){
            finalString+=rows[i];
        }
        System.out.println(finalString);
        }
    }
