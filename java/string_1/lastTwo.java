package java.string_1;

/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
*/

public class lastTwo {
    public String lasttwo(String str) {
        return (str.length() < 2) ? str
                : str.substring(0, str.length() - 2) + Character.toString(str.charAt(str.length() - 1))
                        + Character.toString(str.charAt(str.length() - 2));
    }
}
