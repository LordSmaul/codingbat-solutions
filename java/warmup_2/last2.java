package java.warmup_2;

/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
*/

public class last2 {
    public int last_2(String str) {
        int count = 0;
        if (str.length() < 2)
            return 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(str.substring(str.length() - 2)))
                count++;
        }

        return count;
    }
}
