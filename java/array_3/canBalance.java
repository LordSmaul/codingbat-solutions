package java.array_3;

/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

public class canBalance {
    public boolean canbalance(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int side1 = 0;
            int side2 = 0;
            int k = i;
            int j = 0;

            while (j != i) {
                side1 += nums[j];
                j++;
            }
            while (k != nums.length) {
                side2 += nums[k];
                k++;
            }
            if (side1 == side2) {
                return true;
            }
        }
        return false;

    }
}
