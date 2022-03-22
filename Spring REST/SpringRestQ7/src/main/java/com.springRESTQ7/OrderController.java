package com.springRESTQ7;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;
import com.springRESTQ7.Order;
import com.springRESTQ7.OrderService;

import java.util.ArrayList;
import java.util.List;


@RestController
public class OrderController
{
    @Autowired
    private OrderService orderService;


    @RequestMapping(value = "/orders",method = RequestMethod.GET)
    public List<Order> getAllOrder(){
        List<Order> list = new ArrayList<>();
        list = orderService.getAllOrders();
        System.out.println(list);
        return  list;
    }

    @RequestMapping(value = "/orders",method = RequestMethod.POST)
    public Order addOrder(@RequestBody Order order){
        //System.out.println(order.getItem()+" "+order.getAmountPaid());

        return  orderService.AddOrder(order);
    }

    @RequestMapping(value = "/orders/{id}",method = RequestMethod.GET)
    public  Order getOrderById(@PathVariable("id") String id){
        return  orderService.getOrderById(id);
    }

    @RequestMapping(value="/orders/{id}",method = RequestMethod.DELETE)
    public boolean deleteOrder(@PathVariable("id") String id){
        return  orderService.deteleOrder(id);
    }

    @RequestMapping(value="/orders",method = RequestMethod.PUT)
    public Order updateOrder(@RequestBody Order order){
        return  orderService.updateOrder(order);
    }
}
