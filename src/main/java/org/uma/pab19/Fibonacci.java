package org.uma.pab19;

public class Fibonacci {
  private int result;
  private int partial1 = 0;
  private int partial2 = 1;
  private int temporal;

  public int compute(int number) {

    if (number == 0 || number == 1) {
      result = 0;
    } else {
      for (int i = 2; i <= number; i++) {
        result = partial1 + partial2;
        temporal = partial2;
        partial2 = temporal + partial1;
        partial1 = temporal;
      }
    }

    return result;
  }
}
