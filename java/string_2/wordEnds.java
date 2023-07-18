package java.string_2;

/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
*/

public class wordEnds {
    public String wordends(String str, String word) {

        String s = "";

        for (int i = 0; i < str.length() - word.length() + 1; i++) {
            String temp = str.substring(i, i + word.length());
            if (i > 0 && temp.equals(word)) {
                s += str.substring(i - 1, i);
            }
            if (i < str.length() - word.length() && temp.equals(word)) {
                s += str.substring(i + word.length(), i + word.length() + 1);
            }
        }

        return s;
    }
}
