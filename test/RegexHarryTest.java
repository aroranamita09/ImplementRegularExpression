package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexHarryTest {

    RegexHarry obj;
    @Before
    public void setUp() throws Exception {
        RegexHarry obj = new RegexHarry();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }


    @Test
    public void checkHarry() {
        assertEquals(true,obj.checkHarry("He is Harry"));
        assertEquals(false,obj.checkHarry("He is Henry"));
        assertEquals(true,obj.checkHarry("Harry was here"));
        assertEquals(false,obj.checkHarry("Is Hary here"));
        assertEquals(true,obj.checkHarry("How are you Harry"));
        assertEquals(false,obj.checkHarry("Harryish is clever"));
    }
}
