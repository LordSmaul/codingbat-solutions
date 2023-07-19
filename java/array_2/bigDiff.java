package java.array_2;
import java.util.Arrays;

/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
*/

public class bigDiff {
    public int bigdiff(int[] nums) {
        return Arrays.stream(nums).max().getAsInt() - Arrays.stream(nums).min().getAsInt();
    }
}
