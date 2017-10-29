package com.example.alex.stevesmusicexchange.Instruments;

import com.example.alex.stevesmusicexchange.Behaviours.Playable;

/**
 * Created by Alex on 29/10/2017.
 */

public class Trombone extends Instrument implements Playable {

    public Trombone(String type, String brand, String colour, double boughtPrice){
        super(type, brand, colour, boughtPrice);
    }

    public String play(){
        return "Trooooooooooooommm!";
    }
}
