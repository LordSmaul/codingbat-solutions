package java.array_2;

/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
*/

public class more14 {
    public boolean more_14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 4) {
                count4++;
            }
        }

        return count1 > count4;
    }
}
