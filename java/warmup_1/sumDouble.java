package java.warmup_1;

/*
Given two int values, return their sum. 
Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
*/

public class sumDouble {
    public int sumdouble(int a, int b) {
        if (a == b) {
            return (2 * (a + b));
        } else {
            return a + b;
        }
    }
}
