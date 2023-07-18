package java.string_2;

/* 
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/

public class catDog {
    public boolean catdog(String str) {
        int catCount = str.split("cat", -1).length - 1;
        int dogCount = str.split("dog", -1).length - 1;

        return dogCount == catCount;
    }
}
