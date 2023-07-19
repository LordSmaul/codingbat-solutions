package java.warmup_1;

/*
Return true if the given string begins with "mix", except the 'm' 
can be anything, so "pix", "9ix", etc. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false 
*/

public class mixStart {
    public boolean mixstart(String str) {
        if (str.length() < 3) {
            return false;
        }
        return str.substring(1, 3).equals("ix");
    }
}
