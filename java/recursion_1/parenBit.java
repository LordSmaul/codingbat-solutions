package java.recursion_1;

/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
*/

public class parenBit {
    public String parenbit(String str) {

        if (str.equals("")) {
            return str;
        } else if (str.charAt(0) == '(') {
            if (str.charAt(str.length() - 1) == ')') {
                return str;
            } else {
                return parenbit(str.substring(0, str.length() - 1));
            }
        } else {
            return parenbit(str.substring(1));
        }
    }
}
