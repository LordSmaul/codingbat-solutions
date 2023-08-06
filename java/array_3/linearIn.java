package java.array_3;

/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
*/

public class linearIn {
    public boolean linearin(int[] outer, int[] inner) {

        int found = 0;
        int k = 0;
        if (inner.length == 0) {
            return true;
        }

        for (int i = 0; i < outer.length; i++) {
            if (outer[i] == inner[k]) {
                found++;
                k++;
            } else if (outer[i] > inner[k]) {
                return false;
            }

            if (found == inner.length) {
                return true;
            }
        }
        return false;
    }
}
