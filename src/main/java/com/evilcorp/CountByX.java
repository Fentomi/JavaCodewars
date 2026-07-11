package com.evilcorp;

import java.util.Arrays;

public class CountByX {
  public static int[] countBy(int x, int n){
    int[] result = {};
    int count = 1;
    while (result.length < n) {
      if(count % x == 0) {
        result = Arrays.copyOf(result, result.length+1);
        result[result.length-1] = count;
      }
      count++;
    }
    return result;
  }
}
