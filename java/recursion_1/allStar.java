package java.recursion_1;

/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
*/

public class allStar {
    public String all_Star(String str) {

        if (str.length() < 2) {
            return str;
        } else {
            return str.charAt(0) + "*" + all_Star(str.substring(1));
        }
    }
}
