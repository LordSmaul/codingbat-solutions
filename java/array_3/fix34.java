package java.array_3;

/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4.
Do not move the 3's, but every other number may move.
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
*/

public class fix34 {
    public int[] fix_34(int[] nums) {

        int[] newNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                newNums[i] = 3;
                newNums[i + 1] = 4;
            }
        }

        int numIndex = 0;
        int newIndex = 0;
        while (newIndex < newNums.length) {
            if (newNums[newIndex] == 3) {
                newIndex += 2;
            } else if (nums[numIndex] == 3 || nums[numIndex] == 4) {
                numIndex++;
            } else {
                newNums[newIndex] = nums[numIndex];
                numIndex++;
                newIndex++;
            }
        }

        return newNums;
    }

}
