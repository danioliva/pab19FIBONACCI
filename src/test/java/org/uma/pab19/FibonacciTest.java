package org.uma.pab19;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
  Fibonacci fibonacci;

  @Before
  public void setup() {
    fibonacci = new Fibonacci();
  }

  @After
  public void after() {
    fibonacci = null;
  }




  @Test
  public void shouldFibonacciOfZeroReturnZero() {
    int expectedResult = 0;

    int obtainedResult = fibonacci.compute(0);

    assertEquals(expectedResult, obtainedResult);
  }

  @Test
  public void shouldFibonacciOfOneReturnZero() {
    int expectedResult = 0;

    int obtainedResult = fibonacci.compute(1);

    assertEquals(expectedResult, obtainedResult);
  }

    @Test
    public void shouldFibonacciOfTwoReturnOne() {
        int expectedResult = 1;

        int obtainedResult = fibonacci.compute(2);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void shouldFibonacciOfThreeReturnTwo() {
        int expectedResult = 2;

        int obtainedResult = fibonacci.compute(3);

        assertEquals(expectedResult, obtainedResult);
    }


    @Test
    public void shouldFibonacciOf4Return3() {
        int expectedResult = 3;

        int obtainedResult = fibonacci.compute(4);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void shouldFibonacciOf5Return5() {
        int expectedResult = 5;

        int obtainedResult = fibonacci.compute(5);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void shouldFibonacciOf6Return8() {
        int expectedResult = 1;

        int obtainedResult = fibonacci.compute(2);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void shouldFibonacciOf10Return55() {
        int expectedResult = 55;

        int obtainedResult = fibonacci.compute(10);

        assertEquals(expectedResult, obtainedResult);
    }
}
