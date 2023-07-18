package java.logic_2;

/*
Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

public class evenlySpaced {
    public boolean evenlyspaced(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        }
        if (a == b || b == c || a == c) {
            return false;
        }
        if ((Math.abs(a - b) == Math.abs(b - c)) ||
                (Math.abs(a - b) == Math.abs(a - c)) ||
                (Math.abs(a - c) == Math.abs(b - c))) {
            return true;
        }
        return false;
    }
}
