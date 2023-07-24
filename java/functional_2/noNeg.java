package java.functional_2;

import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
*/

public class noNeg {
    public List<Integer> noneg(List<Integer> nums) {

        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());

    }
}
