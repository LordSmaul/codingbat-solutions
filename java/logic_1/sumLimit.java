package java.logic_1;

/*
Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
If the sum has more digits than a, just return a without b.

sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
*/

public class sumLimit {
    public int sumlimit(int a, int b) {
        if (String.valueOf(a + b).length() == String.valueOf(a).length()) {
            return a + b;
        }
        return a;
    }
}
