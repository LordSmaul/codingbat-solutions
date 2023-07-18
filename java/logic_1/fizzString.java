package java.logic_1;

/*
Given a string str, if the string starts with "f" return "Fizz".
If the string ends with "b" return "Buzz".
If both the "f" and "b" conditions are true, return "FizzBuzz".
In all other cases, return the string unchanged.

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
*/

public class fizzString {
    public String fizzstring(String str) {
        if (str.startsWith("f") && !str.endsWith("b")) {
            return "Fizz";
        }
        if (str.endsWith("b") && !str.startsWith("f")) {
            return "Buzz";
        }
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        }

        return str;
    }
}
