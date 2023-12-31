package java.string_1;

/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
*/

public class endsLy {
    public boolean endsly(String str) {
        if (str.length() < 2) {
            return false;
        }
        return (str.substring(str.length() - 2).equals("ly"));
    }

}
