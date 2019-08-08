package com.ansari.testproxmity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {


    @Before
    public void setUp() throws Exception {
        //setUp == onCreate in actiity
    }

    @After
    public void tearDown() throws Exception {
        //tearDown = onDestroy
    }

    @Test
    public void add() {
        int expected = 40;
        int actual = Calculator.add(10,20);
        assertEquals(expected,actual);
    }
}