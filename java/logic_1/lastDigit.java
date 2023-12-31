package java.logic_1;

/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit.
The ints are non-negative.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
*/

public class lastDigit {
    public boolean lastdigit(int a, int b, int c) {
        return (a % 10 == b % 10) || (b % 10 == c % 10) || (a % 10 == c % 10);
    }
}
