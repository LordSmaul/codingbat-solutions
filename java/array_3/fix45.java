package java.array_3;

/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5.
Do not move the 4's, but every other number may move.
The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
In this version, 5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
*/

public class fix45 {
    public int[] fix_45(int[] nums) {

        int[] newNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                newNums[i] = 4;
                newNums[i + 1] = 5;
            }
        }

        int numIndex = 0;
        int newIndex = 0;
        while (newIndex < newNums.length) {
            if (newNums[newIndex] == 4) {
                newIndex += 2;
            } else if (nums[numIndex] == 4 || nums[numIndex] == 5) {
                numIndex++;
            } else {
                newNums[newIndex] = nums[numIndex];
                newIndex++;
                numIndex++;
            }
        }

        return newNums;
    }
}
