package com.drobyshevskaya.library.project.controller;

import com.drobyshevskaya.library.project.entity.Order;
import com.drobyshevskaya.library.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/library")
public class MyOrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public String showAllOrders(Model model) {
        model.addAttribute("orders", orderService.getAllOrders());
        return "orders";
    }

    @GetMapping("/orders/{id}")
    public String getOrderById(Model model, @PathVariable int id) {
        model.addAttribute("order", orderService.getOrderById(id));
        return "orders";
    }

    @PostMapping("/orders/")
    public String addNewOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
        return "orders";
    }

    @PutMapping("/orders/")
    public String updateOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
        return "orders";
    }

    @DeleteMapping("/orders/{id}")
    public String deleteOrder(@PathVariable int id) {
        orderService.removeOrder(id);
        return "orders";
    }
}
