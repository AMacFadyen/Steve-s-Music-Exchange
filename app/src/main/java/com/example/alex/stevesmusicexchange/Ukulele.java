package com.example.alex.stevesmusicexchange;

/**
 * Created by Alex on 29/10/2017.
 */

public class Ukulele extends Instrument implements Playable {

    int numberOfStrings;

    public Ukulele(String type, String brand, String colour, double boughtPrice, int numberOfStrings){
        super(type, brand, colour, boughtPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Strum-a-plinka-Strum-a-plinka!";
    }
}
