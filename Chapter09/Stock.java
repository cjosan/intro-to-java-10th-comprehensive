package com.company;

/**
 * Created by admin on 16.06.2017.
 */
public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return 100 - currentPrice * 100 / previousClosingPrice;
    }
}
