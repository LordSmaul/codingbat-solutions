package java.recursion_1;

/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
*/

public class countHi {
    public int counthi(String str) {

        if (str.length() < 2) {
            return 0;
        }
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return 1 + counthi(str.substring(2));
        } else {
            return counthi(str.substring(1));
        }
    }
}
