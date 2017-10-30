package com.example.alex.stevesmusicexchange;

import com.example.alex.stevesmusicexchange.Items.DrumSticks;
import com.example.alex.stevesmusicexchange.Items.GuitarStrings;
import com.example.alex.stevesmusicexchange.Items.Plectrum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 29/10/2017.
 */

public class ItemTest {

    DrumSticks drumsticks;
    Plectrum plectrum;
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        drumsticks = new DrumSticks("Sticks for hitting Drums", 24);
        plectrum = new Plectrum("Plastic pics for guitars", 5);
        guitarStrings = new GuitarStrings("Six Steel String Guitar Set", 14, 6);
    }

    @Test
    public void testDrumStickDescrip(){
        assertEquals("Sticks for hitting Drums", drumsticks.getDescription());
    }

    @Test
    public void testPlectrumCost(){
        assertEquals(5, plectrum.getBoughtPrice(), 0.1);
    }

    @Test
    public void testGuitarStringCount(){
        assertEquals(6, guitarStrings.getNumberOfStrings(), 0.1);
    }
}

