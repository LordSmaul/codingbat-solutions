package java.AP_1;

import java.util.ArrayList;
import java.util.List;

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
