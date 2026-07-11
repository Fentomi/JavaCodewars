package com.evilcorp;

import java.util.stream.IntStream;

public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    double avgClassPoint = (double) IntStream.of(classPoints).sum() / classPoints.length;
    return yourPoints > avgClassPoint;
  }
}
