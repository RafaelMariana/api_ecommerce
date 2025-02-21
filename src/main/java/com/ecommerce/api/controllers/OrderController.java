package com.ecommerce.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/orders")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/{id}")
}
