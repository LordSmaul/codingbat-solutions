package java.array_2;

/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
*/

public class no14 {
    public boolean no_14(int[] nums) {
        boolean check1 = false;
        boolean check4 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                check1 = true;
            }
            if (nums[i] == 4) {
                check4 = true;
            }
        }

        if (nums.length == 0 || nums.length == 1) {
            return true;
        } else if (check1 && check4) {
            return false;
        } else if (check1 || check4) {
            return true;
        } else {
            return false;
        }
    }
}
