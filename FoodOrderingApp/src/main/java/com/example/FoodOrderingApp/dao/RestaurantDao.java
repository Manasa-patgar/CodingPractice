package com.example.FoodOrderingApp.dao;

import com.example.FoodOrderingApp.model.Restaurant;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface RestaurantDao
{
    int insertRestaurant(String id, Restaurant restaurant);

    default int insertRestaurant(Restaurant restaurant)
    {
        String id = UUID.randomUUID().toString();
        return insertRestaurant(id, restaurant);
    }

    List<Restaurant> getAllRestaurants();

    int addMenu(String restaurantName, Map menu);

    int updateMenu(String restaurantName, Map menu);
}
