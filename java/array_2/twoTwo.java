package java.array_2;

/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
*/

public class twoTwo {
    public boolean twotwo(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                i++;
                if (i >= nums.length || nums[i] != 2) {
                    return false;
                }
                while (i < nums.length && nums[i] == 2) {
                    i++;
                }
            }
        }
        return true;
    }
}
