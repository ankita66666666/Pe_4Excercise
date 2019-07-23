package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccuranceOfStingUsingMatcherTest {


    OccuranceOfStingUsingMatcher occuranceOfStingUsingMatcher;

    @Before
    public void setUpOnce() {

        occuranceOfStingUsingMatcher = new OccuranceOfStingUsingMatcher();
    }

    @After
    public void tearDownOnce() {

        occuranceOfStingUsingMatcher = null;
    }

    @Test
    public void matching() {
        String expected = "Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 - 29";
        String actual = occuranceOfStingUsingMatcher.matching
                ("She sells seashells by the seashore", "se");

        assertEquals(expected, actual);
    }

    @Test
    public void matchingNotNull() {

        String actual = occuranceOfStingUsingMatcher.matching
                ("She sells seashells by the seashore", "se");
        assertNotNull(actual);
    }
}