package java.array_2;

public class withoutTen {
    public int[] withoutten(int[] nums) {
        int[] newNums = new int[nums.length];
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                newNums[p] = nums[i];
                p++;
            }
        }

        return newNums;
    }
}
