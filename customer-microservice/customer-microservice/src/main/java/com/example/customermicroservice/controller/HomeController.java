package com.example.customermicroservice.controller;

import com.example.customermicroservice.dto.CustomerDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("health")
    public  String health() {
        return "UP";
    }

    @RequestMapping("/customers/{id}")
    public CustomerDto getCustomer(@PathVariable int id) {
        CustomerDto dto = new CustomerDto();
        dto.setEmail("test@gmail.com");
        dto.setName("Test User");
        return dto;
    }
}
