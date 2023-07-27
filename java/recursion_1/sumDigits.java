package java.recursion_1;

/*
Given a non-negative int n, return the sum of its digits recursively.

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
*/

public class sumDigits {
    public int sumdigits(int n) {

        if (n < 10) {
            return n;
        } else {
            return sumdigits(n / 10) + n % 10;
        }
    }
}
