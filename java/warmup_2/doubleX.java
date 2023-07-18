package java.warmup_2;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/

public class doubleX {
    public boolean doublex(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                count++;
            }
            if (str.charAt(i) == 'x' && count == 1 && str.charAt(i + 1) == 'x') {
                return true;
            }
        }
        return false;
    }
}
