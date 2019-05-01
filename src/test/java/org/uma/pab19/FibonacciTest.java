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
  public void shouldFibonacciMonth1PairsProduced3Return1(){
    int expectedResult=1;

    int obtainedResult=fibonacci.compute(1,3);

    assertEquals(expectedResult,obtainedResult);
  }

  @Test
  public void shouldFibonacciMonth2PairsProduced3Return19(){
    int expectedResult=1;

    int obtainedResult=fibonacci.compute(1,3);

    assertEquals(expectedResult,obtainedResult);
  }
  @Test
  public void shouldFibonacciMonth3PairsProduced3Return4(){
    int expectedResult=4;

    int obtainedResult=fibonacci.compute(3,3);

    assertEquals(expectedResult,obtainedResult);
  }

  @Test
  public void shouldFibonacciMonth4PairsProduced3Return7(){
    int expectedResult=7;

    int obtainedResult=fibonacci.compute(4,3);

    assertEquals(expectedResult,obtainedResult);
  }

  @Test
  public void shouldFibonacciMonth5PairsProduced3Return19(){
    int expectedResult=19;

    int obtainedResult=fibonacci.compute(5,3);

    assertEquals(expectedResult,obtainedResult);
  }

  @Test
  public void shouldFibonacciMonth6PairsProduced3Return40(){
    int expectedResult=40;

    int obtainedResult=fibonacci.compute(6,3);

    assertEquals(expectedResult,obtainedResult);
  }

  @Test
  public void shouldFibonacciMonth7PairsProduced3Return97(){
    int expectedResult=97;

    int obtainedResult=fibonacci.compute(7,3);

    assertEquals(expectedResult,obtainedResult);
  }
}
