package com.example.alex.stevesmusicexchange;

/**
 * Created by Alex on 29/10/2017.
 */

public class Guitar extends Instrument implements Playable {

    int numberOfStrings;
    double salePrice;

    public Guitar(String type, String brand, String colour, double boughtPrice, int numberOfStrings){
        super(type, brand, colour, boughtPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String play(){
        return "Strum Strum Strum!";
    }

}
