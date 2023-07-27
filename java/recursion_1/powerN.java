package java.recursion_1;

/*
Given base and n that are both 1 or more, compute recursively the value of base to the n power, so powerN(3, 2) is 9.

powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
*/

public class powerN {
    public int powern(int base, int n) {

        if (n == 1) {
            return base;
        } else {
            return base * powern(base, n - 1);
        }
    }
}
