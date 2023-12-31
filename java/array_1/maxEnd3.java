package java.array_1;

import java.util.Arrays;

/*
Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value.
Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
*/

public class maxEnd3 {
    public int[] maxend3(int[] nums) {
        int max = 0;
        if (nums[0] > nums[nums.length - 1]) {
            max = nums[0];
        } else {
            max = nums[nums.length - 1];
        }

        Arrays.fill(nums, max);
        return nums;
    }
}
