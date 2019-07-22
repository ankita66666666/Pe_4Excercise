package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfStringTest {


    TransposeOfString tos;

    @Before
    public void setUpOnce()  {
        tos= new TransposeOfString();
    }

    @After
    public void tearDownOnce() {
        tos= null;
    }



    @Test
    public void test()  {
        //Act
        String actualValue = tos.transposeString("Puja Neha Rita");
        //Assert
        assertEquals("ajuP aheN atiR",actualValue);
    }

}
