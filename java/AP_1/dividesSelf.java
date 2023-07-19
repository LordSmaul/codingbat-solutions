package java.AP_1;

/*
We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.

dividesSelf(128) → true
dividesSelf(12) → true
dividesSelf(120) → false
*/

public class dividesSelf {
    public boolean dividesself(int n) {

        int nn = n;
        if (n % 10 == 0) {
            return false;
        }
        while (n % 10 != 0) {
            if (nn % (n % 10) != 0) {
                return false;
            } else {
                n /= 10;
            }
        }
        return true;
    }
}
