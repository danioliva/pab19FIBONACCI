package org.uma.pab19;

public class Fibonacci {
  private int result;
  private int conejosMaduros = 0;
  private int conejosJovenes = 1;
  private int temporal;

  public int compute(int month, int pair) {

    if (month == 1 || month == 2) {
      result = 1;
    }
    for (int generation = 2; generation <= month; generation++) {
      temporal = conejosMaduros;
      conejosMaduros = conejosJovenes + conejosMaduros;
      conejosJovenes = temporal * pair;
      result = conejosJovenes + conejosMaduros;
    }

    return result;
  }
}
