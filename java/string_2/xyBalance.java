package java.string_2;

/* 
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not.
One 'y' can balance multiple 'x's.
Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
*/

public class xyBalance {
    public boolean xybalance(String str) {

        if (str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if ((!str.contains("x") && !str.contains("y"))
                    || str.lastIndexOf('y') > str.lastIndexOf('x')) {
                return true;
            }
        }
        return false;
    }
}
