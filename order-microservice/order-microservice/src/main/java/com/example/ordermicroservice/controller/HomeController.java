package com.example.ordermicroservice.controller;

import com.example.ordermicroservice.dto.CustomerDto;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/health")
    public String health() {
        return "UP";
    }

    @RequestMapping("/customer-for-order/{id}")
    public CustomerDto getOrdersForCustomer(@PathVariable int id) {
        System.out.println("fetching customer info");
        CustomerDto customer = restTemplate.getForObject("http://customer-microservice/customers/" + id, CustomerDto.class);

        System.out.println("Customer info: name-" + customer.getName() + " , email-" + customer.getEmail());
        System.out.println("Successfully added order");

        return customer;
    }
}
