package java.map_2;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0.
For example the string "hello" makes the pair "hello":0.

word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
*/

public class word0 {
    public Map<String, Integer> word_0(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, 0);
        }

        return map;
    }
}
