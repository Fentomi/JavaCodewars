package com.evilcorp;

/*
The Fibonacci numbers are the numbers in the following integer sequence
(Fn): 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

F(0)=0
F(1)=1
F(n)=F(n−1)+F(n−2)

Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying
F(n)∗F(n+1)=prod
*/

import java.util.Arrays;

public class ProdFib {
  public static long[] productFib(long prod) {
    long[] array = {0,1};
    int arrayLength = array.length;

    while (array[arrayLength-2] * array[arrayLength-1] < prod) {
      array = Arrays.copyOf(array, arrayLength+1);
      array[arrayLength] = array[arrayLength-2] + array[arrayLength-1];
      arrayLength = array.length;
    }

    if (array[arrayLength-2] * array[arrayLength-1] == prod)
      return new long[]{array[arrayLength-2], array[arrayLength-1], 1};
    else return new long[]{array[arrayLength-2], array[arrayLength-1], 0};
  }
}
