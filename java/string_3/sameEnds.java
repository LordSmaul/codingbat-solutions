package java.string_3;

/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
*/

public class sameEnds {
    public String sameends(String string) {

        String ends = "";
        String temp = "";

        for (int i = 0; i < string.length(); i++) {
            temp += string.charAt(i);
            int templen = temp.length();
            if (i < string.length() / 2 && temp.equals(string.substring(string.length() - templen, string.length()))) {
                ends = temp;
            }
        }

        return ends;
    }
}
