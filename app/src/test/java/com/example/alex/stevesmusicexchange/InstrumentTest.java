package com.example.alex.stevesmusicexchange;

import com.example.alex.stevesmusicexchange.Instruments.Guitar;
import com.example.alex.stevesmusicexchange.Instruments.Piano;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 29/10/2017.
 */

public class InstrumentTest {

    Piano piano;
    Guitar guitar;

    @Before
    public void before(){
        piano = new Piano("Stringed", "Casinovo", "Dark Green", 100, "10th OCT", 88);
        guitar = new Guitar("Stringed", "Ibanez", "Mahogony Brown", 210, 12);
    }

    @Test
    public void testMarkUpPrice(){
        piano.applyMarkup(1.3);
        assertEquals(130, piano.getSalePrice(), 0.1);
    }

    @Test
    public void testPianoColour(){
        assertEquals("Dark Green", piano.getColour());
    }

    @Test
    public void testPianoBrand(){
        assertEquals("Casinovo", piano.getBrand());
    }

    @Test
    public void testPianoBuyCost(){
        assertEquals(100, piano.getBoughtPrice(), 0.1);
    }

    @Test
    public void testFindMarkUp(){
        piano.applyMarkup(1.6);
        assertEquals(1.6, piano.getMarkup(160), 0.1);
    }

    @Test
    public void testGuitarStringCount(){
        assertEquals(12, guitar.getNumberOfStrings());
    }

    @Test
    public void testGuitarBrand(){
        assertEquals("Ibanez", guitar.getBrand());
    }

}
