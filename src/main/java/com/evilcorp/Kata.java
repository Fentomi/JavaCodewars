package com.evilcorp;

public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    // Your code here
    int sumPoints = 0;
    for (int point : classPoints) {
      sumPoints += point;
    }
    double pointsAvg = (double) sumPoints / classPoints.length;

    return yourPoints > pointsAvg;
  }
}
