package java.warmup_1;

/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/

public class frontBack {
    public String frontback(String str) {
        if (str.equals("")) {
            return "";
        } else if (str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1)
                + str.substring(1, str.length() - 1)
                + str.charAt(0);
    }
}
