package java.warmup_1;

/*
Given an int n, return true if it is within 10 of 100 or 200. 

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false 
*/

public class nearHundred {
    public boolean nearhundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }
}
