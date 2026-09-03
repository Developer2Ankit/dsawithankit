package leet.code;

public class StringInt {
    public static void main(String[] args) {


        String s="   -042";
       int  finalValue=myAtoi(s);
        System.out.println(finalValue);
    }
    public static int myAtoi(String s) {

        int sign = 1;
        int i = 0;
        int finalValue = 0;

        // 1. Skip leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Empty string / only spaces
        if (i >= s.length()) {
            return 0;
        }

        // 2. Check sign
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // 3. Read digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = Character.getNumericValue(s.charAt(i));

            // POSITIVE NUMBER
            if (sign == 1) {

                if (finalValue > Integer.MAX_VALUE / 10 ||
                        (finalValue == Integer.MAX_VALUE / 10 && digit > 7)) {

                    return Integer.MAX_VALUE;
                }

                finalValue = finalValue * 10 + digit;
            }

            // NEGATIVE NUMBER
            else {

                // Check underflow BEFORE multiplying
                if (finalValue < Integer.MIN_VALUE / 10 ||
                        (finalValue == Integer.MIN_VALUE / 10 && digit > 8)) {

                    return Integer.MIN_VALUE;
                }

                finalValue = finalValue * 10 - digit;
            }

            i++;
        }

        return finalValue;
    }
}
