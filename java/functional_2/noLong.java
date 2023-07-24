package java.functional_2;

import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of strings, return a list of the strings, omitting any string length 4 or more.

noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
*/

public class noLong {
    public List<String> nolong(List<String> strings) {

        return strings.stream().filter(s -> s.length() <= 3).collect(Collectors.toList());

    }
}
