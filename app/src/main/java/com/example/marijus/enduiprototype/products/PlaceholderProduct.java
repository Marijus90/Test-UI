package com.example.marijus.enduiprototype.products;

/**
 * Created by Marijus on 22/03/2017.
 */

public abstract class PlaceholderProduct implements Product {
    private String name;
    private String price;
    private int image;

    public PlaceholderProduct(){}

    public abstract String getName();
    public abstract String getPrice();
    public abstract int getImage();
}
