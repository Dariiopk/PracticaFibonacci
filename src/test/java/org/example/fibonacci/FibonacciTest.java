package org.example.fibonacci;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
* Test cases:
* Fibonacci 0 -> 0
* Fibonacci 1 -> 1
* Fibonacci 2 -> 1
* Fibonacci 3 -> 2
* Fibonacci 4 -> 3
* */

public class FibonacciTest {

    @Test
    public void shouldReturn0IfNumberTheIs0 (){
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 0;
        int obtainedValue = fibonacci.fibonacci(0);
        assertEquals(expectedValue, obtainedValue);
    }
}