package com.example.FoodOrderingApp.dao;

import com.example.FoodOrderingApp.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class RestaurantDataAccessService implements RestaurantDao
{

    private List<Restaurant> restaurantsList = new ArrayList<>();

    @Override
    public int insertRestaurant(String id, Restaurant restaurant)
    {
        restaurantsList.add(new Restaurant(id, restaurant.getRestuarantName(), restaurant.getMaxOrders(), restaurant.getRating(), restaurant.getMenu()));
        return 1;
    }

    @Override
    public List<Restaurant> getAllRestaurants()
    {
        return restaurantsList;
    }

    @Override
    public int addMenu(String restaurantName, Map menu)
    {
        Optional<Restaurant> restaurantMayBe = restaurantsList.stream().filter(restaurant -> restaurant.getRestuarantName().equalsIgnoreCase(restaurantName)).findFirst();
        return restaurantMayBe.map(restaurant -> {
            Map addmenu = restaurant.getMenu();
            addmenu.putAll(menu);
            return 1;
        }).orElse(0);
    }

    @Override
    public int updateMenu(String restaurantName, Map menu)
    {
        Optional<Restaurant> restaurantMayBe = restaurantsList.stream().filter(restaurant -> restaurant.getRestuarantName().equalsIgnoreCase(restaurantName)).findFirst();
        String[] keys = (String[]) menu.keySet().toArray(new String[0]);
        return restaurantMayBe.map(restaurant -> {
            Map updatmenu = restaurant.getMenu();
            for(String str : keys)
            {
                if (updatmenu.containsKey(str))
                {
                    updatmenu.computeIfPresent(str, (k, v) -> v = menu.get(str));
                    continue;
                }
            }
            return 1;
        }).orElse(0);
    }
}
