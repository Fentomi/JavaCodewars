package com.evilcorp;

import java.util.Arrays;

/*
Напишите функцию, которая принимает массив чисел (целые числа для тестов) и целевое число.
Она должна найти в массиве два разных элемента, сумма которых дает целевое значение.
Индексы этих элементов должны быть возвращены в виде кортежа/списка (в зависимости от вашего языка программирования)
следующим образом: (index1, index2).
*/
public class TwoSum {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
  }
  public static int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i+1; j < numbers.length; j++) {
        if (numbers[i]+numbers[j] == target) return new int[]{i, j};
      }
    }
    return new int[]{};
  }
}
