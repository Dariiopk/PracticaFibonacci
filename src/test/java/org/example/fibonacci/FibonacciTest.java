package org.example.fibonacci;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/*
* Test cases:
* Fibonacci 0 -> 0
* Fibonacci 1 -> 1
* Fibonacci 2 -> 1
* Fibonacci 3 -> 2
* Fibonacci 4 -> 3
* Fibonacci 25 -> 75025
* Fibonacci -1 -> Error
* */



public class FibonacciTest {

    public Fibonacci fibonacci;

    @BeforeEach
    private void setup() {fibonacci = new Fibonacci();}

    @AfterEach
    private void finish() {fibonacci = null;}

    @Test
    public void shouldReturn0IfNumberTheIs0 (){
        int expectedValue = 0;
        int obtainedValue = fibonacci.fibonacci(0);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldReturn1IfNumberTheIs1 (){
        int expectedValue = 1;
        int obtainedValue = fibonacci.fibonacci(1);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldReturn1IfNumberTheIs2 (){
        int expectedValue = 1;
        int obtainedValue = fibonacci.fibonacci(2);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldReturn2IfNumberTheIs3 (){
        int expectedValue = 2;
        int obtainedValue = fibonacci.fibonacci(3);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldReturn3IfNumberTheIs4 (){
        int expectedValue = 3;
        int obtainedValue = fibonacci.fibonacci(4);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldReturn75025IfNumberTheIs25 (){
        int expectedValue = 75025;
        int obtainedValue = fibonacci.fibonacci(25);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldReturnErrorfNumberTheIsNegative (){
        var fibonacci = new Fibonacci();
        assertThrows(RuntimeException.class, () -> fibonacci.fibonacci(-1));
    }

}