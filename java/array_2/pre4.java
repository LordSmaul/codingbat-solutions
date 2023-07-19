package java.array_2;
import java.util.Arrays;

/* 
Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array.
The original array will contain at least one 4.

pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]

*/

public class pre4 { 
    public int[] pre_4(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            index = i;
            if (nums[i] == 4) {
                break;
            }
        }

        return Arrays.copyOfRange(nums, 0, index);
    }
}
