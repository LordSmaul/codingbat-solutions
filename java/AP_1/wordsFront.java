package java.AP_1;

/*
Given an array of strings, return a new array containing the first N strings.
N will be in the range 1..length.

wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
*/

public class wordsFront {
    public String[] wordsfront(String[] words, int n) {

        String[] newWords = new String[n];

        for (int i = 0; i < n; i++) {
            newWords[i] = words[i];
        }

        return newWords;
    }
}
