package com.evilcorp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KataTests {

  @Test
  void basicTests() {
    assertTrue(Kata.betterThanAverage(new int[] {2, 3}, 5), "Input: [2, 3], yourPoints: 5");
    assertTrue(Kata.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75), "Input: [100, 40, 34, 57, 29, 72, 57, 88], yourPoints: 75");
    assertTrue(Kata.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69), "Input: [12, 23, 34, 45, 56, 67, 78, 89, 90], yourPoints: 69");
    assertFalse(Kata.betterThanAverage(new int[] {100, 90}, 11), "Input: [100, 90], yourPoints: 11");
    assertFalse(Kata.betterThanAverage(new int[] {50, 50, 50}, 50), "Input: [50, 50, 50], yourPoints: 50");
  }
}
