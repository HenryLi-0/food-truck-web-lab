package com.foodtruck;

import java.util.HashMap;

public class Menu {

    private HashMap<String, MenuItem> items;

    public Menu() {

        items = new HashMap<>();

        items.put("salad_greek", new Salad("Greek Salad", 7.50));
        items.put("sandwich_turkey", new Sandwich("Turkey Sandwich", 9.50));
        items.put("drink_water", new Drink("Water", 1.50));

        items.put("salad_one", new Salad("Salad 1", 6.00));
        items.put("salad_one_expensive", new Salad("Also Salad 1 but More Expensive", 7.00));
        items.put("sandwich_subscription_minute", new Sandwich("Sandwich As A Service (1 Minute)", 3.00));
        items.put("sandwich_subscription_hour", new Sandwich("Sandwich As A Service (1 Hour)", 175.00));
        items.put("tap_water", new Drink("Tap Water", 1.00));
        items.put("tap_water_with_tap_Water_ice", new Drink("Tap Water with Tap Water Ice", 1.00));
    }

    public HashMap<String, MenuItem> getAllItems() {
        return items;
    }
}

