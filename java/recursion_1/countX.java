package java.recursion_1;

/*
Given a string, compute recursively the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/

public class countX {
    public int countx(String str) {

        if (str.equals("")) {
            return 0;
        }
        if (str.charAt(0) == 'x') {
            return 1 + countx(str.substring(1));
        }
        return countx(str.substring(1));
    }
}
