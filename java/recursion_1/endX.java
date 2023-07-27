package java.recursion_1;

/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
*/

public class endX {
    public String endx(String str) {

        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return endx(str.substring(1)) + "x";
        } else {
            return str.charAt(0) + endx(str.substring(1));
        }
    }
}
