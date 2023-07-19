package java.map_2;

import java.util.HashMap;
import java.util.Map;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array.
When a position in the array has been swapped, it no longer matches anything.
Using a map, this can be solved making just one pass over the array.

allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
*/

public class allSwap {
    public String[] allswap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        String[] result = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String c = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(c)) {
                int d = map.get(c);
                map.remove(c);
                result[i] = result[d];
                result[d] = strings[i];
            } else {
                result[i] = strings[i];
                map.put(c, i);
            }
        }

        return result;
    }
}
