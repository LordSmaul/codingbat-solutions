package java.string_1;

/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
*/

public class conCat {
    public String concat(String a, String b) {

        if (a.length() >= 1 && b.length() >= 1 && a.charAt(a.length() - 1) == b.charAt(0)) {
            b = b.substring(1);
        }

        return a + b;
    }
}
