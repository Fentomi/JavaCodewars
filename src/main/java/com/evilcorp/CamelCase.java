package com.evilcorp;

class CamelCase {
  public static String camelCase(String input) {
    StringBuilder stringBuilder = new StringBuilder();
    for (Character value : input.toCharArray()) {
      stringBuilder.append(value.equals(Character.toLowerCase(value)) ? value : " " + value);
    }
    return stringBuilder.toString();
  }
}
