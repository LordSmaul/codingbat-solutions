package java.logic_1;

/*
Given two int values, return whichever value is larger.
However if the two values have the same remainder when divided by 5, then the return the smaller value.
However, in all cases, if the two values are the same, return 0.

maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3
*/

public class maxMod5 {
    public int maxmod5(int a, int b) {
        if (a == b) {
            return 0;
        }

        if (a % 5 == b % 5) {
            return (a < b) ? a : b;
        } else {
            return (a > b) ? a : b;
        }
    }
}
