package com.example.alex.stevesmusicexchange.Items;

import com.example.alex.stevesmusicexchange.Behaviours.Sellable;

/**
 * Created by Alex on 29/10/2017.
 */

public abstract class Item implements Sellable{

    private String description;
    private double boughtPrice;
    public double sellPrice;

    public Item(String description, double boughtPrice){
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = 0;
    }

    public String getDescription() {
        return description;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void applyMarkup(double markUp){
        sellPrice = boughtPrice * markUp;
    }

    public double getMarkup(double sellPrice){
        return (sellPrice/boughtPrice);
    }
}
