package java.AP_1;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
*/

public class wordsWithoutList {
  public List wordswithoutList(String[] words, int len) {

    ArrayList newWords = new ArrayList();

    for (int i = 0; i < words.length; i++) {
      if (words[i].length() != len) {
        newWords.add(words[i]);
      }
    }

    return newWords;
  }
}
