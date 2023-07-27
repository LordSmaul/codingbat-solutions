package java.recursion_1;

/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
*/

public class noX {
    public String nox(String str) {

        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return nox(str.substring(1));
        } else {
            return str.charAt(0) + nox(str.substring(1));
        }
    }
}
