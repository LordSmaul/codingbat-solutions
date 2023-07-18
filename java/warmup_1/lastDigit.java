package java.warmup_1;

/*
Given two non-negative int values, return true if they have 
the same last digit, such as with 27 and 57. 

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
*/

public class lastDigit {
    public boolean lastdigit(int a, int b) {
        return (a % 10 == b % 10);
    }
}
