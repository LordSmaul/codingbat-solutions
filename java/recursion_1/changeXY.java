package java.recursion_1;

/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
*/

public class changeXY {
    public String changexY(String str) {

        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return 'y' + changexY(str.substring(1));
        } else {
            return str.charAt(0) + changexY(str.substring(1));
        }
    }
}
