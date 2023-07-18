package java.warmup_1;

/*
Given a string, return a string made of the first 2 chars (if present), 
however include first char only if it is 'o' and include the second 
only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/

public class startOz {
    public String startoz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += str.charAt(1);
        }

        return result;
    }
}
