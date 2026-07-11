package com.evilcorp;
import java.lang.StringBuilder;

public class ToCamelCase {
  static String toCamelCase(String s){
    String[] words = s.split("[-_]");
    StringBuilder finalString = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      if (i > 0) {
        String string = words[i];
        char[] chars = string.toCharArray();
        if(Character.isLowerCase(chars[0])) {
          chars[0] = Character.toUpperCase(chars[0]);
          string = String.valueOf(chars);
        }
        words[i] = string;
      }
      finalString.append(words[i]);
    }
    return finalString.toString();
  }
}
