package com.example.FoodOrderingApp.service;

import com.example.FoodOrderingApp.dao.RestaurantDao;
import com.example.FoodOrderingApp.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RestuarantService
{
    @Autowired
    private final RestaurantDao restaurantDao;

    public RestuarantService(RestaurantDao restaurantDao)
    {
        this.restaurantDao = restaurantDao;
    }

    public int addRestaurant(Restaurant restaurant)
    {
        return restaurantDao.insertRestaurant(restaurant);
    }

    public List<Restaurant> getAllRestuarants()
    {
        return restaurantDao.getAllRestaurants();
    }

    public int addMenu(Restaurant restaurant)
    {
        return restaurantDao.addMenu(restaurant.getRestuarantName(), restaurant.getMenu());
    }

    public int updateMenu(String restaurantName, Restaurant restaurant)
    {
        return restaurantDao.updateMenu(restaurantName, restaurant.getMenu());
    }
}
