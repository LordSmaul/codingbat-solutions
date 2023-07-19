package java.array_2;

import java.util.Arrays;

/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array.
The original array will contain at least one 4.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
*/

public class post4 {
    public int[] post_4(int[] nums) {
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            index = i;
            if (nums[i] == 4) {
                break;
            }
        }
        return Arrays.copyOfRange(nums, index + 1, nums.length);
    }
}
