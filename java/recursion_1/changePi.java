package java.recursion_1;

/*
Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
*/

public class changePi {
    public String changepi(String str) {

        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            return "3.14" + changepi(str.substring(2));
        }
        return str.charAt(0) + changepi(str.substring(1));
    }
}
