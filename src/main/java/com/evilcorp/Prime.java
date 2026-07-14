package com.evilcorp;

public class Prime {
  public static boolean isPrime(int num) {
    if (num < 2) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;
    int i = 3;
    while (i * i <= num) {
      if (num % i == 0) return false;
      i += 2;
    }
    return true;
  }
}
