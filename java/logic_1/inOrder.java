package java.logic_1;

/*
Given three ints, a b c, return true if b is greater than a, and c is greater than b.
However, with the exception that if "bOk" is true, b does not need to be greater than a.

inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true
*/

public class inOrder {
    public boolean inorder(int a, int b, int c, boolean bOk) {
        if (!bOk) {
            return (b > a && c > b);
        } else {
            return (c > b);
        }
    }
}
