package java.string_1;

/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
*/

public class withoutX2 {
    public String withoutx2(String str) {

        if (str.length() == 0) {
            return "";
        } else if (str.length() == 1) {
            return (str.equals("x")) ? "" : str;
        }

        if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
            str = str.substring(1);
        } else if (str.charAt(0) != 'x' && str.charAt(1) == 'x') {
            str = Character.toString(str.charAt(0)) + str.substring(2);
        } else if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            str = str.substring(2);
        }

        return str;
    }

}
