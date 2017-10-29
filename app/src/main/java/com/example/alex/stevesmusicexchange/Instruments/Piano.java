package com.example.alex.stevesmusicexchange.Instruments;

import com.example.alex.stevesmusicexchange.Behaviours.Playable;

/**
 * Created by Alex on 29/10/2017.
 */

public class Piano extends Instrument implements Playable {

    String lastTuned;
    int numberOfKeys;

    public Piano(String type, String brand, String colour, double boughtPrice, String lastTuned, int numberOfKeys){
        super(type, brand, colour, boughtPrice);
        this.lastTuned = lastTuned;
        this.numberOfKeys = numberOfKeys;
    }

    public String getLastTuned() {
        return lastTuned;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "Plink Plonk Plunk!";
    }
}
