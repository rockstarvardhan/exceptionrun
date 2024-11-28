package com.neoteric.map.mapdemo.restaurant;

import java.util.List;

public class Order {
    private String day;
    private String month;
    private List<MenuItem> items;

    public Order(String day, String month, List<MenuItem> items) {
        this.day = day;
        this.month = month;
        this.items = items;
    }
    public String getDay() {
        return day;
    }
    public String getMonth() {
        return month;
    }
    public List<MenuItem> getItems() {
        return items;
    }
}
