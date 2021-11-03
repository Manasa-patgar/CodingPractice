package com.example.FoodOrderingApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

public class Order
{
    private String orderId;
    private String userName;
    private HashMap<String, Integer> items;
    private String selectionStrategy;

    public String getUserName()
    {
        return userName;
    }

    public HashMap<String, Integer> getItems()
    {
        return items;
    }

    public String getSelectionStrategy()
    {
        return selectionStrategy;
    }

    public Order(@JsonProperty("orderId") String orderId, @JsonProperty("userName") String userName,
                 @JsonProperty("items") HashMap<String, Integer> items,  @JsonProperty("selectionStrategy") String selectionStrategy)
    {
        this.orderId = orderId;
        this.userName = userName;
        this.items = items;
        this.selectionStrategy = selectionStrategy;
    }
}
