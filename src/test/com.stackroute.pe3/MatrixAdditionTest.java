package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition mx;

    @Before
    public void setUp() throws Exception {
        mx = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        mx = null;
    }


    @Test
    public void add1() {
        int[][] out = {{0}, {0}};
        int[][] in1 = {{0}, {0}};
        int[][] in2 = {{0}, {0}};
        assertArrayEquals(out, mx.add(in1, in2));
    }

    @Test
    public void add2() {
        int[][] out = {{10, 10, 10, 10}, {10, 10, 10, 10}};
        int[][] in1 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] in2 = {{9, 8, 7, 6}, {5, 4, 3, 2}};
        assertArrayEquals(out, mx.add(in1, in2));
    }

    @Test
    public void add3() {
        int[][] out = {{10, 10, 10}, {10, 10, 10}};
        int[][] in1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] in2 = {{9, 8, 7}, {6, 5, 4}};
        assertArrayEquals(out, mx.add(in1, in2));
    }


}