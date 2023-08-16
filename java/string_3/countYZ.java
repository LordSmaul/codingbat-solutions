package java.string_3;

/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
*/

public class countYZ {
    public int countyZ(String str) {

        int count = 0;

        if (Character.toLowerCase(str.charAt(str.length() - 1)) == 'y'
                || Character.toLowerCase(str.charAt(str.length() - 1)) == 'z') {
            count++;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if ((c == 'y' || c == 'z') && !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }

        return count;
    }
}
