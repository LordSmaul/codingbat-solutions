package java.array_2;

/*
Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1.
N may be 0, in which case just return a length 0 array.

fizzArray2(4) → ["0", "1", "2", "3"]
fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
fizzArray2(2) → ["0", "1"]
*/

public class fizzArray2 {
    public String[] fizzarray2(int n) {
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = String.valueOf(i);
        }

        return s;
    }
}
