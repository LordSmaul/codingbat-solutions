package java.recursion_1;

/*
Given a non-negative int n, compute recursively the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double.

count8(8) → 1
count8(818) → 2
count8(8818) → 4
*/

public class count8 {
    public int count_8(int n) {
        int sum;
        if (n == 0) {
            return 0;
        }
        sum = n % 10;
        n = n / 10;
        if (sum == 8 && n % 10 == 8) {
            return 2 + count_8(n);
        } else if (sum == 8) {
            return 1 + count_8(n);
        } else {
            return count_8(n);
        }
    }
}
