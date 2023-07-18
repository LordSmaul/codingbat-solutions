package java.string_1;

/*
Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second char if it is 'b'.
The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/

public class deFront {
    public String defront(String str) {
        if (str.charAt(0) != 'a' && str.charAt(1) != 'b') {
            str = str.substring(2);
        } else if (str.charAt(1) == 'b' && str.charAt(0) != 'a') {
            str = str.substring(1);
        } else if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
            str = Character.toString(str.charAt(0)) + str.substring(2);
        }

        return str;
    }

}
