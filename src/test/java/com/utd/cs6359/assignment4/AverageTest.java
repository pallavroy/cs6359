package com.utd.cs6359.assignment4;

import junit.framework.TestCase;

public class AverageTest extends TestCase {

    public void testAverage_success() {
        Average avg = new Average();
        int[] num = {1, 2, 3};
        int k = 3;
        assertEquals(2, avg.average(k, num));
    }

    public void testAverage_whenKZero_emptyList() {
        Average avg = new Average();
        int[] num = {};
        int k = 0;
        assertEquals(0, avg.average(k, num));
    }

    public void testAverage_whenKZero_nonEmptyList() {
        Average avg = new Average();
        int[] num = {1, 2, 3};
        int k = 0;
        assertEquals(0, avg.average(k, num));
    }

    public void testAverage_whenKNegative_nonEmptyList() {
        Average avg = new Average();
        int[] num = {1, 2, 3};
        int k = -1;
        assertEquals(0, avg.average(k, num));
    }

    public void testAverage_whenKLessThanListLength_nonEmptyList() {
        Average avg = new Average();
        int[] num = {1, 2, 3, 4, 5};
        int k = 3;
        assertEquals(2, avg.average(k, num));
    }

    public void testAverage_whenKGreaterThanListLength_nonEmptyList() {
        Average avg = new Average();
        int[] num = {1, 2, 3, 4, 5};
        int k = 8;
        assertEquals(3, avg.average(k, num));
    }

    public void testAverage_floatAvg() {
        Average avg = new Average();
        int[] num = {1, 2, 3, 4};
        int k = 5;
        assertEquals(2.5, avg.average(k, num));
    }
}