package java.recursion_1;

/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
*/

public class factorial {
    public int factoriaL(int n) {

        if (n == 1) {
            return 1;
        }
        return n * factoriaL(n - 1);
    }
}
