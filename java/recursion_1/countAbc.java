package java.recursion_1;

/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
*/

public class countAbc {
    public int countabc(String str) {

        if (str.equals("") || str.length() < 3) {
            return 0;
        }
        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
            return 1 + countabc(str.substring(1));
        }
        return countabc(str.substring(1));
    }
}
