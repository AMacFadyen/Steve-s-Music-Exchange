package com.example.alex.stevesmusicexchange.Instruments;

import com.example.alex.stevesmusicexchange.Behaviours.Playable;

/**
 * Created by Alex on 29/10/2017.
 */

public class Trumpet extends Instrument implements Playable {

    int numberOfValves;

    public Trumpet(String type, String brand, String colour, double boughtPrice, int numberOfValves){
        super(type, brand, colour, boughtPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "Toot Toot Toot!";
    }
}
