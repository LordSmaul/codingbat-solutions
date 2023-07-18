package java.string_2;

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
*/

public class repeatSeparator {
    public String repeatseparator(String word, String sep, int count) {
        String s = "";

        for (int i = 0; i < count; i++) {
            s += word;
            s += sep;
        }

        return s.substring(0, s.length() - sep.length());
    }
}
