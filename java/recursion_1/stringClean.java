package java.recursion_1;

/*
Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char.
So "yyzzza" yields "yza".

stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
*/

public class stringClean {
    public String stringclean(String str) {

        if (str.length() < 2) {
            return str;
        } else if (str.charAt(0) == str.charAt(1)) {
            return stringclean(str.substring(1));
        } else {
            return str.charAt(0) + stringclean(str.substring(1));
        }
    }
}
