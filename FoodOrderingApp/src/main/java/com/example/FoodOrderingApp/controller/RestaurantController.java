package com.example.FoodOrderingApp.controller;

import com.example.FoodOrderingApp.model.Restaurant;
import com.example.FoodOrderingApp.service.RestuarantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/foodOrderApp/addRestaurant")
public class RestaurantController
{

    @Autowired
    private final RestuarantService restuarantService;

    public RestaurantController(RestuarantService restuarantService)
    {
        this.restuarantService = restuarantService;
    }

    @PostMapping
    public void addRestuarant(@RequestBody Restaurant restaurant)
    {
        restuarantService.addRestaurant(restaurant);
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants()
    {
        return restuarantService.getAllRestuarants();
    }

    @PostMapping(value = "/addMenu")
    public void addMenu(@RequestBody Restaurant restaurant)
    {
        restuarantService.addMenu(restaurant);
    }

    @PutMapping(path = "/{restaurantName}")
    public void updateMenu(@PathVariable("restaurantName") String restaurantName , @RequestBody Restaurant restaurant)
    {
        restuarantService.updateMenu(restaurantName, restaurant);
    }
}
