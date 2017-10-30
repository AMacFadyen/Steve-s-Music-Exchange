package com.example.alex.stevesmusicexchange.Behaviours;

/**
 * Created by Alex on 29/10/2017.
 */

public interface Sellable {

    void applyMarkup(double Markup);
    double getMarkup(double sellPrice);
    double getBoughtPrice();
    double getSalePrice();
    double getProfit();
}
