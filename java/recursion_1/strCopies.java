package java.recursion_1;

/*
Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping.
N will be non-negative.

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
*/

public class strCopies {
    public boolean strcopies(String str, String sub, int n) {

        if (n == 0) {
            return true;
        } else if (str.length() < sub.length()) {
            return false;
        } else if (str.substring(0, sub.length()).equals(sub)) {
            return strcopies(str.substring(1), sub, n - 1);
        } else {
            return strcopies(str.substring(1), sub, n);
        }
    }

}
