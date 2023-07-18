package java.string_2;

/*
A sandwich is two pieces of bread with something in between.
Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/

public class getSandwich {
    public String getsandwich(String str) {

        return (str.indexOf("bread") == str.lastIndexOf("bread"))
                ? ""
                : str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
    }
}
