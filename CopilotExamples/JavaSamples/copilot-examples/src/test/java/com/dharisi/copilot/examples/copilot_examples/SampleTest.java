package com.dharisi.copilot.examples.copilot_examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    public void testFactorial() {
        // Test case 1: factorial of 0 should be 1
        assertEquals(1, Sample.factorial(0));

        // Test case 2: factorial of 5 should be 120
        assertEquals(120, Sample.factorial(5));

        // Test case 3: factorial of 10 should be 3628800
        assertEquals(3628800, Sample.factorial(10));
    }
    
}
