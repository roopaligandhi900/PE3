package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels nop;

    @Before
    public void setUp() throws Exception {
        nop = new  RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        nop = null;
    }

    @Test
    public void noVowel1() {
        String[] in = {"xyz","aei"};
        String[] out = {"xyz",""};
        assertArrayEquals(out,nop.noVowel(in));
    }

    @Test
    public void noVowel2() {
        String[] in = null;
        String[] out = null;
        assertArrayEquals(out,nop.noVowel(in));
    }

    @Test
    public void noVowel3() {
        String[] in = {"aaa","eee"};
        String[] out = {"",""};
        assertArrayEquals(out,nop.noVowel(in));
    }
}