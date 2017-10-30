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
        shop = new Shop("Steve's Music Exchange", 500);
        guitar = new Guitar("String", "Ibanez", "Green", 200, 6);
        plectrum = new Plectrum("Plastic plec", 40);
        piano = new Piano("String", "Casinovo", "Dark Green", 200, "10th OCT", 88);
    }

    @Test
    public void testAddToStock(){
        shop.addItem(plectrum);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void testCostRemoval(){
        shop.addItem(guitar);
        assertEquals(300, shop.getShopFunds(), 0.1);
    }

    @Test
    public void testStockRemoval(){
        shop.addItem(guitar);
        guitar.applyMarkup(1.5);
        assertEquals(300, shop.getShopFunds(), 0.1);
        shop.sellItem(guitar);
        assertEquals(600, shop.getShopFunds(),0.1);
    }

    @Test
    public void testProfitSum(){
        shop.addItem(guitar);
        guitar.applyMarkup(1.5);
        shop.addItem(plectrum);
        plectrum.applyMarkup(1.5);
        shop.addItem(piano);
        piano.applyMarkup(1.5);
        assertEquals(60, shop.getShopFunds(), 0.1);
        shop.sellItem(guitar);
        shop.sellItem(piano);
        shop.sellItem(plectrum);
        assertEquals(720, shop.getShopFunds(), 0.1);
        assertEquals(220, shop.currentProfit, 0.1);
    }
}
