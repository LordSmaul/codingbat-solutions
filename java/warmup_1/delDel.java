package java.warmup_1;

/*
Given a string, if the string "del" appears starting at index 1, 
return a string where that "del" has been deleted. 
Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
*/

public class delDel {
    public String deldel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }
}
