package com.neoteric.map.mapdemo.restaurant;

public class MenuItem {
    private String name;
    private int quantitySold;

    public MenuItem(String name, int quantitySold) {
        this.name = name;
        this.quantitySold = quantitySold;
    }    public String getName() {
        return name;
    }
    public int getQuantitySold() {
        return quantitySold;
    }
}
