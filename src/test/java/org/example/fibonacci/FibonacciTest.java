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

    @Test
    public void shouldReturn1IfNumberTheIs1 (){
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 1;
        int obtainedValue = fibonacci.fibonacci(1);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldReturn1IfNumberTheIs2 (){
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 1;
        int obtainedValue = fibonacci.fibonacci(2);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldReturn2IfNumberTheIs3 (){
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 2;
        int obtainedValue = fibonacci.fibonacci(3);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldReturn3IfNumberTheIs4 (){
        Fibonacci fibonacci = new Fibonacci();
        int expectedValue = 3;
        int obtainedValue = fibonacci.fibonacci(4);
        assertEquals(expectedValue, obtainedValue);
    }
}