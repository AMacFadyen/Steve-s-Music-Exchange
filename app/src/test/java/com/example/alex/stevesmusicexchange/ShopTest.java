package com.example.alex.stevesmusicexchange;

import com.example.alex.stevesmusicexchange.Instruments.Guitar;
import com.example.alex.stevesmusicexchange.Instruments.Piano;
import com.example.alex.stevesmusicexchange.Items.Plectrum;
import com.example.alex.stevesmusicexchange.Shop.Shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 29/10/2017.
 */

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Plectrum plectrum;
    Piano piano;

    @Before
    public void before(){
        shop = new Shop("Steve's Music Exchange", 400);
        guitar = new Guitar("String", "Ibanez", "Green", 150, 6);
        plectrum = new Plectrum("Plastic plec", 25);
        piano = new Piano("String", "Casinovo", "Dark Green", 100, "10th OCT", 88);
    }

    @Test
    public void testAddToStock(){
        shop.addItem(plectrum);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void testCostRemoval(){
        shop.addItem(guitar);
        assertEquals(250, shop.getShopFunds(), 0.1);
    }

    @Test
    public void testStockRemoval(){
        shop.addItem(guitar);
        guitar.applyMarkup(1.3);
        assertEquals(250, shop.getShopFunds(), 0.1);
        shop.sellItem(guitar);
        assertEquals(445, shop.getShopFunds(),0.1);
    }
}
