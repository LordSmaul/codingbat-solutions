package java.string_2;

/* 
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
*/

public class plusOut {
    public String plusout(String str, String word) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - word.length()) {
                if (str.substring(i, i + word.length()).equals(word)) {
                    s += word;
                    i += word.length() - 1;
                } else {
                    s += "+";
                }
            } else {
                s += "+";
            }
        }

        return s;
    }
}
