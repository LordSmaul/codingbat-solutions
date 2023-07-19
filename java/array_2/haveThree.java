package java.array_2;

/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
*/

public class haveThree {
    public boolean havethree(int[] nums) {
        int count = 0;

        if (nums.length < 2) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3) {
                if (nums[i + 1] != 3) {
                    count++;
                } else {
                    return false;
                }
            }
        }

        if (nums[nums.length - 1] == 3) {
            count++;
        }

        return count == 3;
    }
}
