package com.example.FoodOrderingApp.dao;

import com.example.FoodOrderingApp.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDataAccessService implements OrderDao
{

    private List<Order> orders = new ArrayList<>();

    @Override
    public int createOrder(String id, Order order)
    {
        orders.add(new Order(id, order.getUserName(), order.getItems(), order.getSelectionStrategy()));
        return 1;
    }

    @Override
    public List<Order> getAllOrders()
    {
        return orders;
    }
}
