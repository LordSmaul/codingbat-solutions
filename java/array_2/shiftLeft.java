package java.array_2;

/* 
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
*/

public class shiftLeft {
    public int[] shiftleft(int[] nums) {

        int[] newNums = new int[nums.length];

        if (nums.length < 1) {
            return nums;
        }
        if (nums.length == 2) {
            return new int[] { nums[1], nums[0] };
        }

        for (int i = 1; i <= nums.length - 1; i++) {
            newNums[i - 1] = nums[i];
        }
        newNums[nums.length - 1] = nums[0];
        return newNums;
    }
}
