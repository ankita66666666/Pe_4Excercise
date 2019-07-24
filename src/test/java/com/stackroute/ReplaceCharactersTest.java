package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {
    ReplaceCharacters replaceCharacters;


    @Before
    public void setUpOnce() {

        this.replaceCharacters = new ReplaceCharacters();
    }

    @After
    public void tearDownOnce() {

        replaceCharacters = null;
    }

    @Test
    public void replaceCharacters() {
        String expected = "faity fry";
        String actual = replaceCharacters.replaceCharacters("daily dry");
        assertEquals(expected, actual);

    }

    @Test
    public void replaceCharactersNotNull() {
        String actual = replaceCharacters.replaceCharacters("daily dry");
        assertNotNull(actual);

    }
}