package com.evilcorp;

import java.util.stream.Stream;

public class SpinWords {
  public static String spinWords(String sentence) {
    String[] result = Stream.of(sentence.split(" "))
        .map(e -> e.length() >= 5 ? new StringBuilder(e).reverse().toString() : e)
        .toArray(String[]::new);
    return String.join(" ", result);
  }
}