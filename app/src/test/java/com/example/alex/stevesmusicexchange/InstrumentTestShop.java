package com.example.alex.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 29/10/2017.
 */

public class InstrumentTestShop {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Stringed", "Casinovo", "Dark Green", 100, "10th OCT", 88);
    }

    @Test
    public void testMarkUpPrice(){
        piano.applyMarkup(1.3);
        assertEquals(130, piano.getSalePrice(), 0.1);
    }
}
