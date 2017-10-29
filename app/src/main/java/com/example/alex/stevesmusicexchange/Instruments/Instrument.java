package com.example.alex.stevesmusicexchange.Instruments;

import com.example.alex.stevesmusicexchange.Behaviours.Playable;
import com.example.alex.stevesmusicexchange.Behaviours.Sellable;

/**
 * Created by Alex on 29/10/2017.
 */

public abstract class Instrument implements Sellable, Playable {

    private String type;
    private String brand;
    private String colour;
    public double boughtPrice;
    public double sellPrice;

    public Instrument(String type, String brand, String colour, double boughtPrice){
        this.type = type;
        this.brand = brand;
        this.colour = colour;
        this.boughtPrice = boughtPrice;
        sellPrice = 0;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    //Markup explained = 1.3 markup will produce 30% markup. 0.7 would produce 30% discount.
    public void applyMarkup(double markUp){
         sellPrice = boughtPrice * markUp;
    }

    public double getSalePrice() {
        return sellPrice;
    }

    public double getMarkup(double sellPrice){
        return (sellPrice/boughtPrice);
    }
}
