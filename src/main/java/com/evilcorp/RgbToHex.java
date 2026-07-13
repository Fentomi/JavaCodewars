package com.evilcorp;

import java.util.function.Function;

public class RgbToHex {
  public static String rgb(int r, int g, int b) {
    StringBuilder stringBuilder = new StringBuilder();

    Function<Integer, String> intToStringHex = (number) -> {
      if (number <= 0) return "00";
      else if (number > 255) return "FF";
      else return String.format("%02x", number).toUpperCase();
    };

    stringBuilder.append(intToStringHex.apply(r));
    stringBuilder.append(intToStringHex.apply(g));
    stringBuilder.append(intToStringHex.apply(b));

    return stringBuilder.toString();
  }
}
