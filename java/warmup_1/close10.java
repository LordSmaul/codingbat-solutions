package java.warmup_1;

/*
Given 2 int values, return whichever value is nearest to the value 10, 
or return 0 in the event of a tie. 

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0 
*/

public class close10 {
    public int close_10(int a, int b) {
        if (Math.abs(a - 10) == Math.abs(b - 10)) {
            return 0;
        } else if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else {
            return b;
        }
    }
}
