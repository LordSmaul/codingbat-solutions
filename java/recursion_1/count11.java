package java.recursion_1;

/*
Given a string, compute recursively the number of "11" substrings in the string.
The "11" substrings should not overlap.

count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
*/

public class count11 {
    public int count_11(String str) {

        if (str.length() < 2) {
            return 0;
        } else if (str.charAt(0) == '1' && str.charAt(1) == '1') {
            return 1 + count_11(str.substring(2));
        } else {
            return count_11(str.substring(1));
        }
    }
}
