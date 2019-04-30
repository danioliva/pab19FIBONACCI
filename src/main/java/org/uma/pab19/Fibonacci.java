package org.uma.pab19;

public class Fibonacci {
  private int result;
  private int partial1 = 1;
  private int partial2;
  private int temporal;

  public int compute(int month, int pair) {

    if (month == 1 || month == 2) {
      result = 1;
    } else {
      partial2 = pair;
      for (int i = 2; i < month; i++) {

        result = partial1 + partial2;
        temporal = partial2;
        partial2 = temporal + partial1;
        partial1 = temporal;
      }
    }

    return result;
  }
}
