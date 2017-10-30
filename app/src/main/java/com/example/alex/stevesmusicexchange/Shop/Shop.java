package com.example.alex.stevesmusicexchange.Shop;

import com.example.alex.stevesmusicexchange.Behaviours.Sellable;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

/**
 * Created by Alex on 29/10/2017.
 */

public class Shop {

    private String name;
    public double shopFunds;
    private ArrayList<Sellable> stock;
    public double currentProfit;
    public double projectedProfit;

    public Shop(String name, double shopFunds){
        this.name = name;
        this.shopFunds = shopFunds;
        this.stock = new ArrayList<Sellable>();
        this.currentProfit = 0;
        this.projectedProfit = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public double getShopFunds() {
        return shopFunds;
    }

    public void addItem(Sellable sellable){
        if(shopFunds >= sellable.getBoughtPrice()) {
            this.stock.add(sellable);
            shopFunds -= sellable.getBoughtPrice();
        }
    }

    public void sellItem(Sellable sellable){
        stock.remove(sellable);
        shopFunds += sellable.getSalePrice();
        currentProfit += sellable.getProfit();

    }

    public double checkProfitProjection(){
        for(Sellable sellable : stock){
            projectedProfit += sellable.getProfit();
        }
        return projectedProfit;
    }
}
