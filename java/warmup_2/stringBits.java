package java.warmup_2;

/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
*/

public class stringBits {
  public String stringbits(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i += 2) {
      result += Character.toString(str.charAt(i));
    }

    return result;
  }
}
