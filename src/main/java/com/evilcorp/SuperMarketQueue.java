package com.evilcorp;

import java.util.Arrays;

public class SuperMarketQueue {
  public static void main(String[] args) {
    System.out.println(solveSuperMarketQueue(new int[]{1,2,3,4}, 4));
  }

  public static int solveSuperMarketQueue(int[] customers, int n) {
    if (customers.length == 0) return 0;

    if (n >= customers.length) return Arrays.stream(customers).summaryStatistics().getMax();

    int[] tills = new int[n];
    Arrays.fill(tills, 0);

    for (int customerTime : customers) {
      int minIndex = 0;
      for (int i = 1; i < n; i++) {
        if (tills[i] < tills[minIndex]) {
          minIndex = i;
        }
      }
      tills[minIndex] += customerTime;
    }

    return Arrays.stream(tills).summaryStatistics().getMax();
  }
}
