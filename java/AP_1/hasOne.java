package java.AP_1;

/*
Given a positive int n, return true if it contains a 1 digit.

hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
*/

public class hasOne {
    public boolean hasone(int n) {

        while (n != 0) {
            if (n % 10 == 1) {
                return true;
            } else {
                n /= 10;
            }
        }
        return false;
    }
}
