package java.array_3;

/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
*/

public class squareUp {
    public int[] squareup(int n) {

        if (n == 1) {
            return new int[] { n };
        }

        int[] newN = new int[n * n];
        int check = n;
        int i = (n * n) - 1;

        while (i > 0) {
            int j = 1;
            while (j <= n) {
                if (j > check) {
                    newN[i] = 0;
                } else {
                    newN[i] = j;
                }
                j++;
                i--;
            }
            check--;
        }

        return newN;
    }
}
