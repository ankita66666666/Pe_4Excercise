package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortStringTest {


        SortString sortString;

        @Before
        public void setUpOnce() {
            sortString = new SortString();
        }

        @After
        public void tearDownOnce()  {
            sortString = null;
        }



        @Test
        public void givenStringShouldReturnStringSortAlphabetically() {
            //Arrange
            String[] expectedValue = {"abhinav", "anand", "gopal"};

            String[] actualValue = sortString.sorting("gopal anand abhinav");
            //Assert
            assertArrayEquals(expectedValue, actualValue);
            assertNotNull(actualValue);
        }

    }
