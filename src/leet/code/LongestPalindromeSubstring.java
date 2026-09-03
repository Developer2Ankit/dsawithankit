package leet.code;

import java.util.Scanner;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str == null || str.length() < 2) {
            System.out.println("The string has not any palindrome substring");
            return;
        }
        String result = longestPalindrome(str);

        System.out.println("Longest Palindrome: " + result);

    }

    public static String longestPalindrome(String str) {
        int start = 0;
        int maxLength = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            int len1 = expandFromCenter(str, i, i);
            int len2 = expandFromCenter(str, i, i + 1);

            int maxLen = Math.max(len1, len2);

            if (maxLen > maxLength) {

                start = i - (maxLen - 1) / 2;
                maxLength = maxLen;
            }
        }
        return str.substring(start, start + maxLength);
    }
    public static int expandFromCenter(String str, int left, int right) {

        while (left >= 0
                && right < str.length()
                && str.charAt(left) == str.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}
