package java.warmup_1;
import java.util.Arrays;

/*

Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3 
*/

public class intMax {
    public int intmax(int a, int b, int c) {
        int[] array = { a, b, c };
        return Arrays.stream(array).max().getAsInt();
    }
}
