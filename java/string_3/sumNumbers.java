package java.string_3;

/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
A number is a series of 1 or more digit chars in a row.

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/

public class sumNumbers {
    public int sumnumbers(String str) {

        int sum = 0;
        String check = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    check += str.charAt(i);
                    i++;
                }
                sum += Integer.parseInt(check);
                check = "";
            }
        }

        return sum;
    }
}
