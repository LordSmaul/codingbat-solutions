package java.array_1;

import java.util.Arrays;

/*
Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
*/

public class has23 {
    public boolean has_23(int[] nums) {
        return Arrays.toString(nums).contains("2") || Arrays.toString(nums).contains("3");
    }
}
