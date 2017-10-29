package com.example.alex.stevesmusicexchange.Instruments;

/**
 * Created by Alex on 29/10/2017.
 */

public class Saxophone extends Instrument{

    String reedBrand;

    public Saxophone(String type, String brand, String colour, double boughtPrice, String reedBrand){
        super(type, brand, colour, boughtPrice);
        this.reedBrand = reedBrand;
    }

    public String play(){
        return "Pink panther theme tune.";
    }

    public String getReedBrand() {
        return reedBrand;
    }
}
