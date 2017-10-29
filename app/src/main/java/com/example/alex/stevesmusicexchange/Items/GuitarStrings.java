package com.example.alex.stevesmusicexchange.Items;

/**
 * Created by Alex on 29/10/2017.
 */

public class GuitarStrings extends Item{

    double numberOfStrings;

    public GuitarStrings(String description, double boughtPrice, double numberOfStrings){
        super(description, boughtPrice);
        this.numberOfStrings = numberOfStrings;
    }


}
