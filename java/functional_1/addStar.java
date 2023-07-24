package java.functional_1;

import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of strings, return a list where each string has "*" added at its end.

addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
*/

public class addStar {
    public List<String> addstar(List<String> strings) {

        return strings.stream().map(s -> s + "*").collect(Collectors.toList());

    }
}
