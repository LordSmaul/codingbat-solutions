package java.string_2;

/* 
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
*/

public class sameStarChar {
    public boolean samestarChar(String str) {
        boolean found = true;

        for (int i = 0; i < str.length(); i++) {
            String tmpString = str.substring(i, i + 1);

            if (tmpString.equals("*") && i > 0 && i < str.length() - 1) {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    found = true;
                } else {
                    found = false;
                }
            }
        }
        return found;
    }
}
