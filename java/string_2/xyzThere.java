package java.string_2;

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
*/

public class xyzThere {
  public boolean xyzthere(String str) {

    boolean xyzCheck = false;

    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).compareTo("xyz") == 0 && i == 0) {
        xyzCheck = true;
      }
      if (str.substring(i, i + 3).compareTo("xyz") == 0 && str.charAt(i - 1) != '.') {
        xyzCheck = true;
      }
    }

    return xyzCheck;
  }
}
