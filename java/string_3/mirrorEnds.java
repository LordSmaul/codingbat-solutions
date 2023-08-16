package java.string_3;

/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very beginning of the given string, and at the very end of the string in reverse order (possibly overlapping).
For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
*/

public class mirrorEnds {
    public String mirrorends(String string) {

        String mirror = "";

        for (int i = 0, j = string.length() - 1; i < string.length(); i++, j--) {
            if (string.charAt(i) == string.charAt(j)) {
                mirror += string.charAt(i);
            } else {
                break;
            }
        }

        return mirror;
    }
}
