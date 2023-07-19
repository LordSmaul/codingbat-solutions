package java.array_2;

/*
Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
*/

public class zeroMax {
    public int[] zeromax(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            if (nums[i] == 0) {
                int j = i;
                while (j < nums.length) {
                    if (nums[j] % 2 != 0 && nums[j] >= index) {
                        index = nums[j];
                    }
                    j++;
                }
                nums[i] = index;
            }
        }

        return nums;
    }
}
