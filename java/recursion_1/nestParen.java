package java.recursion_1;

/*
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".

nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
*/

public class nestParen {
    public boolean nestparen(String str) {

        if (str.equals("")) {
            return true;
        } else if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestparen(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }
}
