package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharacterTest {


    CountCharacter countCharacter;
    @Before
    public void setUpOnce()  {
        countCharacter=new CountCharacter();
    }

    @After
    public void tearDownOnce()  {
        countCharacter=null;
    }


    @Test
    public void characterCount() {
        int expected=10;
        int actual=countCharacter.countCharacter("Java is java again java again",'a');
        assertEquals(expected,actual);
    }

    @Test
    public void characterCountFailure() {
        int expected=10;
        int actual=countCharacter.countCharacter("Java is java again java again",'J');
        assertNotEquals(expected,actual);
    }

    @Test
    public void characterCountNotNull() {
        int actual=countCharacter.countCharacter("Java is java again java again",'J');
        assertNotNull(actual);
    }

}
