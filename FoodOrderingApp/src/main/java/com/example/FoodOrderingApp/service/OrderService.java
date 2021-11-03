package com.example.FoodOrderingApp.service;

import com.example.FoodOrderingApp.dao.OrderDao;
import com.example.FoodOrderingApp.dao.RestaurantDao;
import com.example.FoodOrderingApp.model.Order;
import com.example.FoodOrderingApp.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class OrderService
{

    @Autowired
    private final OrderDao orderDao;

    @Autowired
    private final RestaurantDao restaurantDao;

    public OrderService(OrderDao orderDao, RestaurantDao restaurantDao)
    {
        this.orderDao = orderDao;
        this.restaurantDao = restaurantDao;
    }

    public String createOrder(Order order)
    {
        List<Restaurant> restaurantList = restaurantDao.getAllRestaurants();
        String[] items = order.getItems().keySet().toArray(new String[0]);
        int totalItems = items.length;
        int count = 0;
        Iterator itr = restaurantList.listIterator();
        Restaurant restaurantFound = null;
        while (itr.hasNext())
        {
            restaurantFound = (Restaurant) itr.next();
            count = 0;
            for (String item : items)
            {
                if (restaurantFound.getMenu().containsKey(item) && count < totalItems)
                {
                    count++;
                    if (count == totalItems)
                    {
                        orderDao.createOrder(order);
                        return "Order assigned to " + restaurantFound.getRestuarantName();
                    }
                    else
                    {
                        continue;
                    }
                }
            }
        }
        return "No Restaurants available for this Order";
    }

    public List<Order> getAllOrders()
    {
        return orderDao.getAllOrders();
    }
}
