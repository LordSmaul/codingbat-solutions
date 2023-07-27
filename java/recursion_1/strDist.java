package java.recursion_1;

/*
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.

strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
*/

public class strDist {
    public int strdist(String str, String sub) {

        if (str.length() < sub.length()) {
            return 0;
        } else if (str.substring(0, sub.length()).equals(sub)
                && str.substring(str.length() - sub.length()).equals(sub)) {
            return str.length();
        } else if (!str.substring(0, sub.length()).equals(sub)) {
            return strdist(str.substring(1), sub);
        } else {
            return strdist(str.substring(0, str.length() - 1), sub);
        }
    }
}
