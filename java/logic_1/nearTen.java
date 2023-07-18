package java.logic_1;

/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
*/

public class nearTen {
    public boolean nearten(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }
}
