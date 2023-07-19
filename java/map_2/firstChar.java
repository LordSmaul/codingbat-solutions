package java.map_2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.

firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
*/

public class firstChar {
    public Map<String, String> firstchar(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            String s1 = s.substring(0, 1);
            if (map.containsKey(s1)) {
                map.put(s1, map.get(s1) + s);
            } else {
                map.put(s1, s);
            }
        }

        return map;
    }
}
