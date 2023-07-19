package java.array_2;

public class notAlone {
    public int[] notalone(int[] nums, int val) {

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length - 1 && nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }

        return nums;
    }
}
