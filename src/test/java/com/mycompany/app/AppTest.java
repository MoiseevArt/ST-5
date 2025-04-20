package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAveragePositive() {
        Sqrt s = new Sqrt(0);
        assertEquals(5.0, s.average(3.0, 7.0), 1e-9);
    }

    @Test
    void testAverageNegative() {
        Sqrt s = new Sqrt(0);
        assertEquals(-1.0, s.average(-2.0, 0.0), 1e-9);
    }

    @Test
    void testGoodTrue() {
        Sqrt s = new Sqrt(0);
        assertTrue(s.good(2.000000001, 4.0));
    }

    @Test
    void testGoodFalse() {
        Sqrt s = new Sqrt(0);
        assertFalse(s.good(2.1, 4.0));
    }

    @Test
    void testImprove() {
        Sqrt s = new Sqrt(0);
        assertEquals(1.5, s.improve(1.0, 2.0), 1e-9);
    }

    @Test
    void testIterConverges() {
        Sqrt s = new Sqrt(9.0);
        assertEquals(3.0, s.iter(1.0, 9.0), 1e-8);
    }

    @Test
    void testCalcZeroApprox() {
        Sqrt s = new Sqrt(0.0);
        double r = s.calc();
        assertTrue(r <= Math.sqrt(1e-8));
    }

    @Test
    void testCalcOne() {
        Sqrt s = new Sqrt(1.0);
        assertEquals(1.0, s.calc(), 1e-8);
    }

    @Test
    void testCalcTwo() {
        Sqrt s = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), s.calc(), 1e-8);
    }

    @Test
    void testCalcLarge() {
        Sqrt s = new Sqrt(1e6);
        assertEquals(1e3, s.calc(), 1e-6);
    }
}
