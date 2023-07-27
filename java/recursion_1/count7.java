package java.recursion_1;

/*
Given a non-negative int n, return the count of the occurrences of 7 as a digit.

count7(717) → 2
count7(7) → 1
count7(123) → 0
*/

public class count7 {
    public int count_7(int n) {

        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count_7(n / 10);
        }
        return count_7(n / 10);
    }
}
