package java.recursion_1;

/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
*/

public class countHi2 {
    public int counthi2(String str) {

        if (str.length() < 2)
            return 0;
        if (str.substring(str.length() - 2, str.length()).equals("hi")
                && ((str.length() > 2 && str.charAt(str.length() - 3) != 'x') || str.length() == 2)) {
            return 1 + counthi2(str.substring(0, str.length() - 1));
        }
        return counthi2(str.substring(0, str.length() - 1));
    }
}
