package com.example.alex.stevesmusicexchange;

/**
 * Created by Alex on 29/10/2017.
 */

public abstract class Instrument implements Sellable {

    private String type;
    private String brand;
    private String colour;
    public double boughtPrice;
    public double salePrice;

    public Instrument(String type, String brand, String colour, double boughtPrice){
        this.type = type;
        this.brand = brand;
        this.colour = colour;
        this.boughtPrice = boughtPrice;
        salePrice = 0;
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

    public void applyMarkup(double markUp){
         salePrice = boughtPrice * markUp;
    }

    public double getSalePrice() {
        return salePrice;
    }
}
