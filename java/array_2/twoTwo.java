package java.array_2;

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
