package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumTest {

    ConsecutiveNum cn;

    @Before
    public void setUp() throws Exception {
        cn = new ConsecutiveNum();
    }

    @After
    public void tearDown() throws Exception {

        cn=null;

    }

    @Test
    public void checkCons() {
        assertEquals(true,cn.checkCons("1,2,3,4,5,6,7"));
        assertEquals(false,cn.checkCons("1,2,3,2,1,6,7"));
        assertEquals(false,cn.checkCons("1,2,2,3,4,5,6"));
        assertEquals(false,cn.checkCons("1,2,3,4,5,5,6"));
    }
}