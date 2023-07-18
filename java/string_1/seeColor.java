package java.string_1;

/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/

public class seeColor {
    public String seecolor(String str) {
        if (str.length() < 3) {
            return "";
        }

        if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        }
        if (str.length() > 3 && str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}
