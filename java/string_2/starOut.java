package java.string_2;

/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
*/

public class starOut {
    public String starout(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != '*') {
                result += str.charAt(i);
            }
            if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') {
                result += str.charAt(i);
            }
            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') {
                result = result.substring(0, result.length() - 1);
            }
        }

        return result;
    }
}
