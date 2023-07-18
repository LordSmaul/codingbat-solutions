package java.string_1;

/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
*/

public class theEnd {
    public String theend(String str, boolean front) {
        return (front == false) ? Character.toString(str.charAt(str.length() - 1)) : Character.toString(str.charAt(0));
    }
}
