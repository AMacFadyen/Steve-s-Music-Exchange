package com.example.alex.stevesmusicexchange.Instruments;

import com.example.alex.stevesmusicexchange.Behaviours.Playable;
import com.example.alex.stevesmusicexchange.Behaviours.Sellable;

/**
 * Created by Alex on 29/10/2017.
 */

public class DrumKit extends Instrument implements Sellable, Playable{

    public DrumKit(String type, String brand, String colour, double boughtPrice){
        super(type, brand, colour, boughtPrice);
    }

    public String play(){
        return "Bang Tss Bong Tss!";
    }
}
