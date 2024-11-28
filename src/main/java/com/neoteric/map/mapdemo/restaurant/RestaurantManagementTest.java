package com.neoteric.map.mapdemo.restaurant;

import java.util.*;

public class RestaurantManagementTest {
    public static void main(String[] args) {
        List<Order> orders = initializeOrders();
        if (orders == null || orders.isEmpty()) {
            System.out.println("No orders available to analyze.");
            return;
        }
        String mostsalingday = findmostsalingday(orders);
        System.out.println("mostsalingday day: " + mostsalingday);
        String findmostsalingtMonth = findsalingmonth(orders);
        System.out.println("mostsalingmonth: " + findmostsalingtMonth);
        Map<String, Integer> itemSales = calculateItemSales(orders);
        String mostSoldItem = findMostSoldItem(itemSales);
        String leastSoldItem = findLeastSoldItem(itemSales);
        System.out.println("Most sold item: " + mostSoldItem);
        System.out.println("Least sold item: " + leastSoldItem);
    }
    public static List<Order> initializeOrders() {
        MenuItem chickenfry = new MenuItem("chickenfry", 50);
        MenuItem muttonbiryani = new MenuItem("muttonbiryani", 30);
        MenuItem pasta = new MenuItem("Pasta", 20);
        return Arrays.asList(
                new Order("Monday", "January", Arrays.asList(chickenfry, muttonbiryani)),
                new Order("Tuesday", "February", Arrays.asList(pasta, muttonbiryani)),
                new Order("wednesday", "march", Arrays.asList(pasta, chickenfry)),
                new Order("thursday", "april", Arrays.asList(chickenfry,muttonbiryani, pasta)),
                new Order("friday", "may", Arrays.asList(pasta))
        );
    }
    public static Map<String, Integer> calculateItemSales(List<Order> orders) {
        Map<String, Integer> itemSales = new HashMap<>();

        for (Order order : orders) {
            for (MenuItem item : order.getItems()) {
                itemSales.put(item.getName(), itemSales.getOrDefault(item.getName(), 0) + item.getQuantitySold());
            }
        }
        return itemSales;
    }
    public static String findMostSoldItem(Map<String, Integer> itemSales) {
        String mostSoldItem = null;
        int maxSales = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : itemSales.entrySet()) {
            if (entry.getValue() > maxSales) {
                maxSales = entry.getValue();
                mostSoldItem = entry.getKey();
            }
        }
        return mostSoldItem;
    }
    public static String findLeastSoldItem(Map<String, Integer> itemSales) {
        String leastSoldItem = null;
        int minSales = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : itemSales.entrySet()) {
            if (entry.getValue() < minSales) {
                minSales = entry.getValue();
                leastSoldItem = entry.getKey();
            }
        }
        return leastSoldItem;
    }
    public static String findmostsalingday(List<Order> orders) {
        Map<String, Integer> dayOrderCount = new HashMap<>();

        for (Order order : orders) {
            dayOrderCount.put(order.getDay(), dayOrderCount.getOrDefault(order.getDay(), 0) + 1);
        }
        String findmosalingday = null;
        int maxOrders = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : dayOrderCount.entrySet()) {
            if (entry.getValue() > maxOrders) {
                maxOrders = entry.getValue();
                findmosalingday = entry.getKey();
            }
        }
        return findmosalingday;
    }
    public static String findsalingmonth(List<Order> orders) {
        Map<String, Integer> monthOrderCount = new HashMap<>();
        for (Order order : orders) {
            monthOrderCount.put(order.getMonth(), monthOrderCount.getOrDefault(order.getMonth(), 0) + 1);
        }
        String findsalingmonth = null;
        int maxOrders = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : monthOrderCount.entrySet()) {
            if (entry.getValue() > maxOrders) {
                maxOrders = entry.getValue();
                findsalingmonth = entry.getKey();
            }
        }
        return findsalingmonth;
    }
}



