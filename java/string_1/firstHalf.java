package java.string_1;

/*
Given a string of even length, return the first half.
So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
*/

public class firstHalf {
    public String firsthalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
