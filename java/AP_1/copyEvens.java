package java.AP_1;

/*
Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
The original array will contain at least "count" even numbers.

copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
*/

public class copyEvens {
    public int[] copyevens(int[] nums, int count) {

        int[] newNums = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && index != count) {
                newNums[index] = nums[i];
                index++;
            }
        }

        return newNums;
    }
}
