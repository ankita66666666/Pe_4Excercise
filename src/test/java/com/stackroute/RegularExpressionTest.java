package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {


    RegularExpression regularExpression;
    @Before
    public void setUpOnce()  {
       regularExpression=new RegularExpression();
    }

    @After
    public void tearDownOnce()  {
    }

    @Test
    public void isHarryHere() {
        boolean expected=true;
        boolean actual=regularExpression.isHarryHere("This is harry.");
        assertEquals(expected,actual);

    }
    @Test
    public void isHarryHereFail() {
        boolean expected=false;
        boolean actual=regularExpression.isHarryHere("This is henry.");
        assertEquals(expected,actual);

    }
    @Test
    public void isHarryHereNotNull() {

        boolean actual=regularExpression.isHarryHere("This is henry.");
        assertNotNull(actual);

    }
}