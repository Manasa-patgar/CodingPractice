package com.example.FoodOrderingApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Restaurant
{
   private String id;

   @NonNull
   private String restuarantName;


   private int maxOrders;


   private double rating;


   private Map<String, Double> menu;

    public Map<String, Double> getMenu()
    {
        return menu;
    }

    public String getId()
    {
        return id;
    }

    public String getRestuarantName()
    {
        return restuarantName;
    }

    public int getMaxOrders()
    {
        return maxOrders;
    }

    public double getRating()
    {
        return rating;
    }



    public Restaurant( @JsonProperty("id") String id,
                       @JsonProperty("restuarantName") String restuarantName,
                      @JsonProperty("maxOrders") int maxOrders,
                      @JsonProperty("rating") double rating,
                      @JsonProperty("menu") Map<String, Double> menu)
    {
        this.id = id;
        this.restuarantName = restuarantName;
        this.maxOrders = maxOrders;
        this.rating = rating;
        this.menu = menu;
    }
}
