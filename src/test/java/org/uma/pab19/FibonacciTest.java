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
    public void shouldFibonacciMonth5Pairs3Return19(){
      int expectedResult=19;

      int obtainedResult=fibonacci.compute(5,3);

      assertEquals(expectedResult,obtainedResult);
  }
}
